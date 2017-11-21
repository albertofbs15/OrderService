package service;

import model.Product;
import service.createOrder.CreateOrderRequest;
import service.createOrder.ResponseCreateOrder;
import service.updateRequest.UpdateItemRequest;
import service.updateRequest.UpdateOrderRequest;
import service.getOrderById.ResponseOrderStatus;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public interface TouresBalonService {

    ResponseCreateOrder createOrder(CreateOrderRequest requestCreateOrder);

    boolean updateOrder(UpdateOrderRequest requestUpdateOrderStatus);

    boolean updateItem(UpdateItemRequest requestUpdateItemStatus);

    Product getProductById(int productId);

    ResponseOrderStatus getOrderById(int orderId);

}
