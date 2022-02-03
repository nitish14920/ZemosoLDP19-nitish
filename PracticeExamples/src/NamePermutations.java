import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutations {
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();

        String fullName;
        int indexOfSpace;
        int length = 5;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<length;i++){
            System.out.println("Please Enter Full Name " + i);
            fullName = scanner.nextLine();

            indexOfSpace = fullName.indexOf(" ");
            firstName.add( fullName.substring(0,indexOfSpace ));
            lastName.add(fullName.substring(indexOfSpace+1));
        }
        for(int i=0;i<length;i++){

            for (int j = 0;j<length;j++){
                System.out.println(firstName.get(i)+" "+lastName.get(j));
            }
        }
    }
}
