import java.io.ObjectStreamException;

public class MakeSum{
    
    private int number;
    private int sum = 0;

    public MakeSum(int number){
        this.number = number;
    }

    public double Sum(int number) throws OverHundredException{
        if(this.sum <= 100){
            return this.sum += number;
        }
        else{
            OverHundredException msg;
            msg = new OverHundredException();
            throw msg;
        }
    }

}