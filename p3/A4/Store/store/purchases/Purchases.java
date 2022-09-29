package store.purchases;

import Exceptions.ExistAccountException;
import Exceptions.ExistProcuctException;
import store.person.User;
import store.person.UserList;
import store.product.Product;
import store.product.ProductList;


public class Purchases {
    
    private User buyer;
    private Product productToBuy;
    private int quantity;

    public Purchases(User buyer, Product productToBuy) {
        this.buyer = buyer;
        this.productToBuy = productToBuy;
        this.quantity = productToBuy.getQuantity();
    }

    public void Verification(String userId, String productId) throws ExistAccountException, ExistProcuctException{
        UserList userList = new UserList();
        ProductList productList = new ProductList();
        for (User user : userList.getUserList()) {
            if(user.getId().compareTo(userId) == 0){
                
            }
            for (Product product : productList.getProductList()) {
                if(product.getProductId().compareTo(productId) == 0){
                    ExistProcuctException
                }
            }
        }
    }

    
}

