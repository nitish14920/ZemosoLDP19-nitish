package assignment_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String inp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        inp = scanner.nextLine();
        Assignment2 assignment2 = new Assignment2();
        System.out.println(assignment2.checkString(inp));


    }
}
