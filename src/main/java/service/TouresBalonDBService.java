package service;

import model.Order;
import model.Product;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

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

        for (Item item :  createOrder.getItems()) {
            model.Item orderItem = new model.Item(item.getProductId(), item.getProductName(), item.getPrice(), item.getQuantity(), order);
            order.getItems().add(orderItem);
            entityManager.persist(orderItem);
        }

        ResponseCreateOrder responseCreateOrder = new ResponseCreateOrder();
        responseCreateOrder.setOrderId(order.getId());

        System.out.println("Done " + order.getId());
        return responseCreateOrder;

    }

    @Override
    public boolean updateOrderStatus(UpdateOrderStatus updateOrderStatus) {
        Order order = entityManager.find(Order.class, updateOrderStatus.getOrderId());
        if (order == null ) {
            System.out.println("ORDER WITH ID " + updateOrderStatus.getOrderId() + " WAS NOT FOUND");
            return false;
        }

        order.setStatus(updateOrderStatus.getStatus());
        entityManager.persist(order);
        return true;

    }

    @Override
    public Product getProductById(int productId) {
        return entityManager.find(Product.class, productId);
    }

    @Override
    public ResponseOrderStatus getOrderById(int orderId) {
        Order order = entityManager.find(Order.class, orderId);

        ResponseOrderStatus responseCreateOrder = new ResponseOrderStatus();
        responseCreateOrder.setOrderId(orderId);
        responseCreateOrder.setLodgingOrder(order.getLodgingOrder());
        responseCreateOrder.setSpectacleOrder(order.getSpectacleOrder());
        responseCreateOrder.setTransportOrder(order.getTransportOrder());

        return responseCreateOrder;
    }
}
