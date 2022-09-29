package Exceptions;

public class DontExistBookException extends Exception{
    
    public DontExistBookException(){
        super("This book doesn't exist!");
    }
}
