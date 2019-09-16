
import java.io.PrintStream;
import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your 3 test scores.");
        float firstTestScore = keyboard.nextFloat();
        float secondTestScore = keyboard.nextFloat();
        float thirdTestScore = keyboard.nextFloat();

        float averageTestScore = (firstTestScore + secondTestScore + thirdTestScore) / 3;

        if (averageTestScore >= 90) {
            System.out.println("Your averaage test score is " + averageTestScore + " (A)");
        } else if (averageTestScore < 90 && averageTestScore >= 80) {
            System.out.println("Your averaage test score is " + averageTestScore + " (B)");
        } else if (averageTestScore < 80 && averageTestScore >= 70) {
            System.out.println("Your averaage test score is " + averageTestScore + " (C)");
        } else if (averageTestScore < 70 && averageTestScore >= 60) {
            System.out.println("Your averaage test score is " + averageTestScore + " (D)");
        } else if (averageTestScore < 60) {
            System.out.println("Your averaage test score is " + averageTestScore + " (F)");
        }
    }
}
