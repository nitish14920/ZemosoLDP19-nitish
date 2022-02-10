import java.util.Random;

public class TwoD_Array {
    public static void main(String[] args) {
        int [][] twoDArr = new int[3][3];
        create2dArray(twoDArr);
        print2dArray(twoDArr);
    }
    public static void create2dArray(int[][] twoDArr){

        Random random = new Random();
        for(int i=0;i<twoDArr.length;i++){

            for (int j=0;j<twoDArr[0].length;j++){
                twoDArr[i][j] = random.nextInt(100);
            }
        }
    }
    public static void print2dArray(int[][] twoDArr){
        for (int[]arr : twoDArr){
            for (int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
