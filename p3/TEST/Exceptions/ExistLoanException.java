package Exceptions;

public class ExistLoanException extends Exception{

    public ExistLoanException(){
        super("This loan already exists");
    }
}
