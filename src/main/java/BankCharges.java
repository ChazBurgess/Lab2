
import java.util.Scanner;

public class BankCharges {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of checks written for the month.");

        int numberOfChecks = keyboard.nextInt();
        int baseFee = 10;
        double serviceFee;
        

        if (numberOfChecks < 20) {
            serviceFee = (numberOfChecks * .1) + baseFee;
            System.out.println("Your bank service fee for the month is $" + serviceFee );
        } else if (numberOfChecks == 20 || numberOfChecks <= 39) {
            serviceFee = (numberOfChecks * .08) + baseFee;
            System.out.println("Your bank service fee for the month is $" + serviceFee );
        } else if (numberOfChecks == 40 || numberOfChecks <= 59) {
            serviceFee = (numberOfChecks * .06) + baseFee;
            System.out.println("Your bank service fee for the month is $" + serviceFee );
        } else if (numberOfChecks >= 60) {
            serviceFee = (numberOfChecks * .04) + baseFee;
            System.out.println("Your bank service fee for the month is $" + serviceFee );
        }
        
    }

}
