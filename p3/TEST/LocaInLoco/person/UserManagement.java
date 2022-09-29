package person;

import java.util.ArrayList;
import java.util.List;

import Exceptions.DontExistAccountException;
import Exceptions.ExistAccountException;

public class UserManagement {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public UserManagement() {
        this.userList = new ArrayList<>();
    }

    public void add(User user) throws ExistAccountException{
        if(existUser(user.getId()) == true){
            ExistAccountException msg = new ExistAccountException();
            throw msg;
        }
        else{
            userList.add(user);
        }
    }

    public void remove(User user) throws DontExistAccountException{
        if(existUser(user.getId()) == true){
            userList.remove(user);
        }
        else{
           DontExistAccountException msg = new DontExistAccountException();
            throw msg;
        }
    }

    public boolean existUser(String id){
        for (User user : userList) {
            if(user.getId().compareTo(id) == 0)
                return true;
        }
        return false;
    }

}
