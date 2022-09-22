import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number;
        int cont = 1;

        try {
            System.out.print("Insert a number: ");
            number = in.nextInt();
            System.out.println("Number of numbers counted: " + cont);

            MakeSum obj = new MakeSum(number);

            double sum = obj.Sum(number);

            while (sum <= 100) {
                System.out.print("Insert another number: ");
                number = in.nextInt();
                cont++;
                sum = obj.Sum(number);
                System.out.println("Number of numbers counted: " + cont);
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + sum / cont);
            }
        } catch (OverHundredException msg) {
            System.out.println(msg.getMessage());
        }

    }
}
