
import java.util.Scanner;

public class SumOfNumbers {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
        int enteredNumber = -1; 
        int sum = 0;
        
        while (enteredNumber < 1){
            System.out.println("Please enter a number 1 or higher.");
            enteredNumber = keyboard.nextInt();
        } 
        for (int i = 1; i<= enteredNumber; i++){
            sum = sum + i;
        }
        System.out.println("The total of the numbers from 1 to "+ enteredNumber + " is " + sum);
        
}
 
}
