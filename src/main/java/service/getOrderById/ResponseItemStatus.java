package service.getOrderById;

import java.io.Serializable;

/**
 * Created by AHernandezS on 19/11/2017.
 */
public class ResponseItemStatus implements Serializable {

    private int id;
    private int transportOrder;
    private int lodgingOrder;
    private int spectacleOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
