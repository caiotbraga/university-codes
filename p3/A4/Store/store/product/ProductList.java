package store.product;

import java.util.ArrayList;
import java.util.List;

import Exceptions.ExistProcuctException;

public class ProductList {

    private List<Product> productList;

    public ProductList(){
        productList = new ArrayList();
    }
    
    public void add(Product product) throws ExistProcuctException{
        if(ExistProduct(product.getProductId()) == true){
            ExistProcuctException msg = new ExistProcuctException();
            throw msg;
        }
        productList.add(product);
    }

    public boolean ExistProduct(String id){
        for (Product product : productList) {
            if(product.getProductId().compareTo(id) == 0)
                return true;
        }
        return false;
    }
}
