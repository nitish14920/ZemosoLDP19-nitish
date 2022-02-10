public class RecursiveCountDown {
    public static void main(String[] args) {
        countDown(5 );
    }

    public static void countDown(int num){

        if(num > 0){
            System.out.println(num);
            num--;
            countDown(num);
        }

    }
}
