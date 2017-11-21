package service.getOrderById;

import java.io.Serializable;
import java.util.List;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public class ResponseOrderStatus implements Serializable{
    private int orderId;
    private String status;
    private List<ResponseItemStatus> responseItemStatusList;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<ResponseItemStatus> getResponseItemStatusList() {
        return responseItemStatusList;
    }

    public void setResponseItemStatusList(List<ResponseItemStatus> responseItemStatusList) {
        this.responseItemStatusList = responseItemStatusList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
