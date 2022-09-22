package Exceptions;

public class OverHundredException extends Exception{
    
    private int number;
    private int sum = 0;

    public OverHundredException(int number){
        super("Can't go over 100");
        this.number = number;
        this.sum += number;
    }
}
