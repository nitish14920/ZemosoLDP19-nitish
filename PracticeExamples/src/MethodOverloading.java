public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(5,6));
        System.out.println(getResult(5,"6"));
        System.out.println(getResult(5.3));

    }
    public static int getResult(int num){
        return num;
    }
    public static int getResult(int num1,int num2){
        return num1 + num2;
    }
    public static int getResult(int num , String num2){
        return num + Integer.parseInt(num2);
    }
    public static double getResult(double num){
        return num;
    }
}
