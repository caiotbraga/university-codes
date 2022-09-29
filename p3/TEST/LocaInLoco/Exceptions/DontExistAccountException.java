package Exceptions;

public class DontExistAccountException extends Exception{
    
    public DontExistAccountException(){
        super("You can't remove an nonexistent account! ");
    }
}
