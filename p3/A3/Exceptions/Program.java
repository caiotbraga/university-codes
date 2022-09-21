import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int number;
        int sum = 0;

        while(sum < 100){
            System.out.print("Insert a number: ");
            number = in.nextInt();
            sum += number;
            System.out.println(sum);
        }
        
    }
}
