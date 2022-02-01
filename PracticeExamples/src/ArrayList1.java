import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        double num;
        ArrayList<Double> arrayList = new ArrayList<>();
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        while (!flag){

            System.out.println("Enter a Positive num or enter -1 to exit.");
            num = scanner.nextDouble();
            if(num<0){
                flag = true;
                break;
            }
            arrayList.add(num);
        }
        for(int i=arrayList.size()-1;i>=0;i--){
            System.out.println(arrayList.get(i));
        }
    }
}
