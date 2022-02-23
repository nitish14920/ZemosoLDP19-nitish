import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scanner.nextLine();

        if(Pattern.matches("^[A-Z].*[.]$",str))
        {
            System.out.println("The sentence is correct.");
        }
        else if(Pattern.matches("^[A-Z].[^\\.]",str)){
            System.out.println("The sentence does not end with period.");
        }
        else if(Pattern.matches("^[a-z].*[.]$",str)){
            System.out.println("The sentence does not start with capital letter.");
        }
        else{
            System.out.println("The sentence does not start with capital letter and doesn't end with period.");
        }
    }
}
