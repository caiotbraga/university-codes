package store;
import store.purchases.*;

import java.util.ArrayList;

import Exceptions.ExistAccountException;
import Exceptions.ExistProcuctException;
import store.person.*;
import store.product.*;

public class Store {

    private UserList userList;
    private ProductList productList;

    public void createUser(String id, String name, int age) throws ExistAccountException{
        userList.add(new User(id, name, age));
    }

    public  void createInternationalProduct(String productId, Double price, int quantity) throws ExistProcuctException{
        productList.add(new InternationalProduct(productId, price, quantity));
    }

    public void createNationalProduct(String productId, Double price, int quantity) throws ExistProcuctException{
        productList.add(new NationalProduct(productId, price, quantity));
    }
    

 









    public static void menu(){
        System.out.println("-------------------------------------");
        System.out.println("1: Add new user");
        System.out.println("2: Add new product");
        System.out.println("3: Buy a product");
        System.out.println("4: Exit program");
        System.out.println("Insert the option:");
        System.out.println("-------------------------------------");
    }
}