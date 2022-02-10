package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIleInput {
    public static void main(String[] args) {
        Scanner fileData;

        try{
            fileData = new Scanner(new File("input.txt"));
            int data;

            while (fileData.hasNext()){
                data = fileData.nextInt();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException Nf){
            System.out.println("File not found");
            System.out.println(Nf.getMessage());
        }
    }
}
