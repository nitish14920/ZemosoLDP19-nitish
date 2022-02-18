import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of dates");

        int n = scanner.nextInt();
        System.out.println();
        ArrayList<LocalDate> date1 = new ArrayList<>();
        ArrayList<LocalDate> date2 = new ArrayList<>();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");

        System.out.println("Enter dates:");

        for (int i=0;i<n;i++){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");

            date1.add(LocalDate.parse(str[0],df));
            date2.add(LocalDate.parse(str[1],df));
        }
        System.out.println("The ranges are:");
        System.out.println();

        for(int i=0;i<n;i++){
            if(date1.get(i).isAfter(date2.get(i))){
                System.out.println("NO range");
                continue;
            }
            else {
                if(date1.get(i).getYear()<date2.get(i).getYear()){
                    int yeardifference = date2.get(i).getYear() - date1.get(i).getYear();
                    date1.set(i,date1.get(i).plusYears(yeardifference));
                }
                LocalDate minusdays = date1.get(i).minusDays(30);
                LocalDate plusdays = date1.get(i).plusDays(30);
                System.out.println(minusdays.format(df)+" ");

                if(plusdays.isAfter(date2.get(i))){
                    System.out.println(date2.get(i).format(df));
                }
                else {
                    System.out.println(plusdays.format(df));
                }
            }
        }
    }
}
