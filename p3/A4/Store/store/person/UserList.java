package store.person;

import java.util.ArrayList;
import java.util.List;

import Exceptions.ExistAccountException;

public class UserList {

    private List<User> userList;

    public UserList() {
        this.userList = new ArrayList<>();
    }

    public void add(User user) throws ExistAccountException{
        if(ExistUser(user.getId()) == true){
            ExistAccountException msg = new ExistAccountException();
            throw msg;
        }
        userList.add(user);
    }

    public boolean ExistUser(String id){
        for (User user : userList) {
            if(user.getId().compareTo(id) == 0)
                return true;
        }
        return false;
    }

}
