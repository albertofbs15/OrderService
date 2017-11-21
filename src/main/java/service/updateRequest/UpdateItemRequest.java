package service.updateRequest;

/**
 * Created by AHernandezS on 19/11/2017.
 */
public class UpdateItemRequest {
    private int itemId;
    private int transportOrder;
    private int lodgingOrder;
    private int spectacleOrder;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
