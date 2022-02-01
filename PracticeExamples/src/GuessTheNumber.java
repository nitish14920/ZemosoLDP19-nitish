import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber ;
        int userInput;
        int count = 0;
        boolean flag = false;
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        randomNumber = random.nextInt(100)+1;

        while (!flag) {
            System.out.println("Guess the number");
            userInput = keyboard.nextInt();
            count++;
            if (userInput == randomNumber) {
                System.out.println("Congratulations your Guess is Correct!!!! you Guessed the number in " + count + " Attempts");
                flag = true;
            } else if (userInput > randomNumber) {
                System.out.println("Your Guess is High !");
            } else {
                System.out.println("Your Guess is Low !");
            }
        }
    }
}
