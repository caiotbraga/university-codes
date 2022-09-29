package store.product;

abstract public class Product implements Iproduct{
    
    protected String productId;
    protected Double price;
    protected int quantity;

    public Product(String productId, Double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calculatePrice() {
    }

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}
