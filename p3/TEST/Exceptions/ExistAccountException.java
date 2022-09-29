package Exceptions;

public class ExistAccountException extends Exception{
    
    public ExistAccountException(){
        super("This account already exists!");
    }
}
