package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 * Created by AHernandezS on 5/11/2017.
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private int productId;
    @Column
    private String productName;
    @Column
    private int price;
    @Column
    private int quantity;
    @Column
    private int transportOrder;
    @Column
    private int transportProvider;
    @Column
    private int lodgingOrder;
    @Column
    private int lodgingProvider;
    @Column
    private int spectacleOrder;
    @Column
    private int spectacleProvider;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    public Item() {
    }

    public Item(int productId, String productName, int price, int quantity, Order order) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public Item(int productId, String productName, int price, int quantity, int lodgingProvider, int transportProvider, int spectacleProvider, Order order) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
        this.lodgingProvider = lodgingProvider;
        this.transportProvider = transportProvider;
        this.spectacleProvider = spectacleProvider;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTransportOrder() {
        return transportOrder;
    }

    public void setTransportOrder(int transportOrder) {
        this.transportOrder = transportOrder;
    }

    public int getTransportProvider() {
        return transportProvider;
    }

    public void setTransportProvider(int transportProvider) {
        this.transportProvider = transportProvider;
    }

    public int getLodgingOrder() {
        return lodgingOrder;
    }

    public void setLodgingOrder(int lodgingOrder) {
        this.lodgingOrder = lodgingOrder;
    }

    public int getLodgingProvider() {
        return lodgingProvider;
    }

    public void setLodgingProvider(int lodgingProvider) {
        this.lodgingProvider = lodgingProvider;
    }

    public int getSpectacleOrder() {
        return spectacleOrder;
    }

    public void setSpectacleOrder(int spectacleOrder) {
        this.spectacleOrder = spectacleOrder;
    }

    public int getSpectacleProvider() {
        return spectacleProvider;
    }

    public void setSpectacleProvider(int spectacleProvider) {
        this.spectacleProvider = spectacleProvider;
    }
}