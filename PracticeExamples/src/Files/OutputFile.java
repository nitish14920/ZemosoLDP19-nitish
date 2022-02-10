package Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputFile {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Nitish");
        names.add("Sumit");
        names.add("Neha");
        names.add("Ankit");

        try {
            PrintWriter pw = new PrintWriter("output.txt");
            for (String name : names){
                pw.println(name);
            }
        pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File Not Found !");
        }

    }
}
