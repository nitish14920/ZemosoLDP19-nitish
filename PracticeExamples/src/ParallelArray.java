import java.sql.Array;
import java.util.Scanner;

public class ParallelArray {
    public static void main(String[] args) {

        int[] ages = new int[5];
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<ages.length;i++){

            System.out.print("Enter name: ");
            names[i] = scanner.next();
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();

        }
        for (int i=0;i<ages.length;i++){
            System.out.println( names[i] +" is " + ages[i]+" years old.");
        }


    }
}
