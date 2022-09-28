package store.product;

public class InternationalProduct extends Product{
    
    Double IOF = 0.3;

    public InternationalProduct(String productId, Double price, int quantity) {
        super(productId, price, quantity);
    }

    @Override
    public void calculatePrice() {
        this.price = price + (price * IOF);
    }

}
