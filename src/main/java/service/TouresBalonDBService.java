package service;

import model.Order;
import model.Product;
import service.createOrder.CreateOrderRequest;
import service.createOrder.ItemCreateRequest;
import service.createOrder.ResponseCreateOrder;
import service.getOrderById.ResponseItemStatus;
import service.updateRequest.UpdateItemRequest;
import service.updateRequest.UpdateOrderRequest;
import service.getOrderById.ResponseOrderStatus;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TouresBalonDBService implements TouresBalonService {

    @PersistenceContext(unitName = "orders-pu")
    private EntityManager entityManager;

    @Override
    public ResponseCreateOrder createOrder(CreateOrderRequest createOrder) {
        System.out.println("Hibernate one to many (XML Mapping)");

        Order order = new Order();
        order.setOrderDate(new Date());
        order.setPrice(createOrder.getPrice());
        order.setStatus("EN VALIDACION");
        order.setCustomerId(createOrder.getUserId());
        order.setComments("Comment");
        entityManager.persist(order);

        List<Integer> itemIdList = new ArrayList<>();
        for (ItemCreateRequest item :  createOrder.getItems()) {
            model.Item orderItem = new model.Item(item.getProductId(), item.getProductName(), item.getPrice(), item.getQuantity(),
                    item.getLodgingProvider(), item.getTransportProvider(), item.getSpectacleProvider(), order);
            order.getItems().add(orderItem);
            entityManager.persist(orderItem);
            itemIdList.add(orderItem.getId());
        }

        ResponseCreateOrder responseCreateOrder = new ResponseCreateOrder();
        responseCreateOrder.setOrderId(order.getId());
        responseCreateOrder.setItemId(itemIdList);

        System.out.println("Done " + order.getId());
        return responseCreateOrder;

    }

    @Override
    public Product getProductById(int productId) {
        return entityManager.find(Product.class, productId);
    }

    @Override
    public boolean updateOrder(UpdateOrderRequest updateOrder) {
        Order order = entityManager.find(Order.class, updateOrder.getOrderId());
        if (order == null ) {
            System.out.println("ORDER WITH ID " + updateOrder.getOrderId() + " WAS NOT FOUND");
            return false;
        }

        order.setStatus(updateOrder.getStatus());
        entityManager.persist(order);

        if (updateOrder.getUpdateItemRequests() != null ) {
            for (UpdateItemRequest updateItemStatus : updateOrder.getUpdateItemRequests()){
                model.Item item = entityManager.find(model.Item.class, updateItemStatus.getItemId());

                item.setLodgingOrder(updateItemStatus.getLodgingOrder());
                item.setTransportOrder(updateItemStatus.getTransportOrder());
                item.setSpectacleOrder(updateItemStatus.getSpectacleOrder());

                entityManager.persist(item);
            }
        }

        return true;
    }

    @Override
    public boolean updateItem(UpdateItemRequest requestUpdateItemStatus) {
        model.Item item = entityManager.find(model.Item.class, requestUpdateItemStatus.getItemId());

        item.setLodgingOrder(requestUpdateItemStatus.getLodgingOrder());
        item.setTransportOrder(requestUpdateItemStatus.getTransportOrder());
        item.setSpectacleOrder(requestUpdateItemStatus.getSpectacleOrder());

        entityManager.persist(item);

        return true;
    }

    @Override
    public ResponseOrderStatus getOrderById(int orderId) {

        Order order = entityManager.find(Order.class, orderId);

        ResponseOrderStatus responseOrderStatus = new ResponseOrderStatus();
        responseOrderStatus.setOrderId(orderId);
        responseOrderStatus.setStatus(order.getStatus());

        List<ResponseItemStatus> responseItemStatusList = new ArrayList<>();
        for (model.Item item : order.getItems()){

            ResponseItemStatus responseItemStatus =  new ResponseItemStatus();
            responseItemStatus.setId(order.getId());
            responseItemStatus.setLodgingOrder(item.getLodgingOrder());
            responseItemStatus.setSpectacleOrder(item.getSpectacleOrder());
            responseItemStatus.setTransportOrder(item.getTransportOrder());

            responseItemStatus.setLodgingProvider(item.getLodgingProvider());
            responseItemStatus.setSpectacleProvider(item.getSpectacleProvider());
            responseItemStatus.setTransportProvider(item.getTransportProvider());

            responseItemStatusList.add(responseItemStatus);
        }

        responseOrderStatus.setResponseItemStatusList(responseItemStatusList);
        return responseOrderStatus;
    }
}
