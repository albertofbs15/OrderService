package service;

import java.io.Serializable;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public class ResponseOrderStatus implements Serializable{
    private int orderId;
    private int transportOrder;
    private int lodgingOrder;
    private int spectacleOrder;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTransportOrder() {
        return transportOrder;
    }

    public void setTransportOrder(int transportOrder) {
        this.transportOrder = transportOrder;
    }

    public int getLodgingOrder() {
        return lodgingOrder;
    }

    public void setLodgingOrder(int lodgingOrder) {
        this.lodgingOrder = lodgingOrder;
    }

    public int getSpectacleOrder() {
        return spectacleOrder;
    }

    public void setSpectacleOrder(int spectacleOrder) {
        this.spectacleOrder = spectacleOrder;
    }
}
