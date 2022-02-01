import java.util.Scanner;

public class Divisibleby3 {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        number = keyboard.nextInt();

        if(number%3==0){
            System.out.println("This Number is divisible by 3");
        }
        else{
            System.out.println("Not divisible by 3");
        }
    }
}
