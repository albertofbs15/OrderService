package service;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by AHernandezS on 4/11/2017.
 */
@XmlRootElement
public class UpdateOrderStatus {
    private int orderId;
    private String status;
    private int transportOrder;
    private int lodgingOrder;
    private int spectacleOrder;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
