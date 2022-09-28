package store.product;

public class NationalProduct extends Product{

    public NationalProduct(String productId, double price, int quantity) {
        super(productId, price, quantity);
    }

    @Override
    public void calculatePrice() {
        this.price = price;
    }
    
}
