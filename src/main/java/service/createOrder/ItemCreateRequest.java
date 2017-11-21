package service.createOrder;

public  class ItemCreateRequest {
    private int productId;
    private String productName;
    private int price;
    private int quantity;

    private int transportProvider;
    private int lodgingProvider;
    private int spectacleProvider;

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