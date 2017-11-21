package service.updateRequest;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by AHernandezS on 4/11/2017.
 */
@XmlRootElement
public class UpdateOrderRequest {
    private int orderId;
    private String status;
    private List<UpdateItemRequest> updateItemRequests;

    public List<UpdateItemRequest> getUpdateItemRequests() {
        return updateItemRequests;
    }

    public void setUpdateItemRequests(List<UpdateItemRequest> updateItemRequests) {
        this.updateItemRequests = updateItemRequests;
    }

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
}
