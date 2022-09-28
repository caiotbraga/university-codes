package store;
import store.purchases.*;

import java.util.ArrayList;

import store.person.*;
import store.product.*;

public class Store {

    private UserList userList;

    public void createUser(String id, String name, int age){
        userList.add(new User(id, name, age));
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