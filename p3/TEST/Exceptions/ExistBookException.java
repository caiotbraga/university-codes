package Exceptions;

public class ExistBookException extends Exception{
    
    public ExistBookException(){
        super("This book already exists!");
    }
}
