import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        int[] array = new int[5];
        int number;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i<array.length;i++){
            System.out.println("Enter a Number");
            number = scanner.nextInt();
            array[i] = number;
        }
        for (int i = 0 ;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
