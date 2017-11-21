package service.manualApprobation;

/**
 * Created by AHernandezS on 7/11/2017.
 */
public class OrderInfoForApprobation {

    private int clientId;
    private int orderId;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
