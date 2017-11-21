package service.getOrderById;

import java.io.Serializable;

/**
 * Created by AHernandezS on 19/11/2017.
 */
public class ResponseItemStatus implements Serializable {

    private int id;
    private int transportProvider;
    private int lodgingProvider;
    private int spectacleProvider;
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

    public int getTransportProvider() {
        return transportProvider;
    }

    public void setTransportProvider(int transportProvider) {
        this.transportProvider = transportProvider;
    }

    public int getLodgingProvider() {
        return lodgingProvider;
    }

    public void setLodgingProvider(int lodgingProvider) {
        this.lodgingProvider = lodgingProvider;
    }

    public int getSpectacleProvider() {
        return spectacleProvider;
    }

    public void setSpectacleProvider(int spectacleProvider) {
        this.spectacleProvider = spectacleProvider;
    }
}
