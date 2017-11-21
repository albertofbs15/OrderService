package service.createOrder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public class CreateOrderRequest implements Serializable {
    private int price;
    private int userId;
    List<ItemCreateRequest> items = new ArrayList<>();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<ItemCreateRequest> getItems() {
        return items;
    }

    public void setItems(List<ItemCreateRequest> items) {
        this.items = items;
    }


}
