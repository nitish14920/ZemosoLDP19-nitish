import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullname;
        String firstname;
        String lastname;

        System.out.println("Enter Your Full-Name");
        fullname = scanner.nextLine();
        int indexOfSpace = fullname.indexOf(" ");
        firstname = fullname.substring(0,indexOfSpace);
        lastname = fullname.substring(indexOfSpace+1);
        System.out.println(firstname.toLowerCase());
        System.out.println(lastname.toUpperCase());
    }
}
