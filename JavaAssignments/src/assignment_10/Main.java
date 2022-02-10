package assignment_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SList<Integer> sll = new SList<>();
        SListIterator slliterator = sll.iterator();

        boolean flag = true;
        while (flag){
            System.out.println("Enter menu option number: 1, 2, 3, 4");
            System.out.println("1.Printing 2.Insert at the End 3.Delete at the End 4.Exit");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println(sll);
                    break;
                case 2:
                    System.out.println("Enter a number to insert");
                    int data = scanner.nextInt();
                    slliterator.insert(data);
                    break;
                case 3:
                    slliterator.remove(sll.head);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Entered wrong option");
            }
        }
    }
}
