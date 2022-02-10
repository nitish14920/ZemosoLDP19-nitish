package assignment_11;

import assignment_10.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class CharOccurences {
    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(new File(args[0]));
            PrintWriter pw = new PrintWriter("output.txt");

            Map<Character, Integer> occurences = new HashMap<Character, Integer>();

            while (input.hasNext()) {
                char[] str = input.nextLine().toCharArray();
                for (char i : str) {
                    if (i == ' ') {
                        continue;
                    }
                    if (occurences.containsKey(i)) {
                        occurences.put(i, occurences.get(i) + 1);
                    } else {
                        occurences.put(i, 1);
                    }
                }

            }
            Set set = occurences.entrySet();
            Iterator itr = set.iterator();

            while (itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next();
                pw.println(entry.getKey() + " " + entry.getValue());
            }
            pw.close();
            input.close();
        }
        catch (FileNotFoundException e){
            System.err.println(e);
        }

    }
}
