import java.util.Scanner;

import store.Store;

public class Menu {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int op;
        Store store;

        do {
            Store.menu();
            op = in.nextInt();
            while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Invalid option! Please insert a valid one:");
                op = in.nextInt();
            }
            switch (op) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        } while (op != 5);
    }

}
