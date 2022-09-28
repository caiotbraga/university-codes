package Exceptions;

public class ExistProcuctException extends Exception{
    
    public ExistProcuctException(){
        super("This product already exists!");
    }
}
