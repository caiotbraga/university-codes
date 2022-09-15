import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        int op;
        double side;

        Scanner in = new Scanner(System.in);
        
        do {
            menu();
            op = in.nextInt();
            while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Invalid option! Please insert a valid one:");
                op = in.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.print("Insert the radius: ");
                    double radius = in.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.printf("The circle area: %.2f\n", circle.calculateArea());
                    break;
                case 2:
                    System.out.print("Insert triangle's base: ");
                    double base = in.nextDouble();
                    System.out.print("Insert triangle's height: ");
                    double height = in.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("The triangle area : "+triangle.calculateArea());
                    break;
                case 3:
                    System.out.print("Insert the square's side: ");
                    side = in.nextDouble();
                    Square square = new Square(side, side, side, side);
                    System.out.println("The square area : "+square.calculateArea());
                    break;
                case 4:
                    System.out.print("Insert the rectangle's base: ");
                    base = in.nextDouble();
                    System.out.print("Insert the rectangle's height: ");
                    height = in.nextDouble();
                    Rectangle rectangle = new Rectangle(base, height, base, height);
                    System.out.println("The rectangle are : "+rectangle.calculateArea());
                    break;
            }
        } while (op != 5);
    }

    private static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("1: Calculate circle area: ");
        System.out.println("2: Calculate triangle area: ");
        System.out.println("3: Calculate Square area: ");
        System.out.println("4: Calculate Rectangle area: ");
        System.out.println("5: Exit program");
        System.out.println("Insert the option:");
        System.out.println("-------------------------------------");
    }
    }

