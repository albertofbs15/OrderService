package service.createOrder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public class ResponseCreateOrder implements Serializable{
    private int orderId;
    private List<Integer> itemId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Integer> getItemId() {
        return itemId;
    }

    public void setItemId(List<Integer> itemId) {
        this.itemId = itemId;
    }
}
