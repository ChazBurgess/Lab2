
import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        /* couldnt figure out how to put it all into
        one for loop. it was stressing me out so I just 
        took the long way
        */
        int store1;
        int store2;
        int store3;
        int store4;
        int store5;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter today's sales for store 1: ");
        store1 = keyboard.nextInt();
        System.out.print("Enter today's sales for store 2: ");
        store2 = keyboard.nextInt();
        System.out.print("Enter today's sales for store 3: ");
        store3 = keyboard.nextInt();
        System.out.print("Enter today's sales for store 4: ");
        store4 = keyboard.nextInt();
        System.out.print("Enter today's sales for store 5: ");
        store5 = keyboard.nextInt();

       
        System.out.println("\n Daily Sales Bar Chart");

        System.out.print("\n Store 1: ");
        for (int i = 0; i < store1; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("\n Store 2: ");
        for (int i = 0; i < store2; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("\n Store 3: ");
        for (int i = 0; i < store3; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("\n Store 4: ");
        for (int i = 0; i < store4; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("\n Store 5: ");
        for (int i = 0; i < store5; i += 100) {
            System.out.print("*");
        }
    }
}
