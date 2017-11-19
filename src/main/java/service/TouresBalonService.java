package service;

import model.Product;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public interface TouresBalonService {

    ResponseCreateOrder createOrder(CreateOrderRequest requestCreateOrder);

    boolean updateOrderStatus(UpdateOrderStatus requestUpdateOrderStatus);

    Product getProductById(int productId);

    ResponseOrderStatus getOrderById(int orderId);

}
