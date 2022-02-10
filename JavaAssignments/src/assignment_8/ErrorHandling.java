package assignment_8;

public class ErrorHandling {
    public static void main(String[] args) {
        String s = null;

        try{
            //int num = 100/0;
            System.out.println(s.length());
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("This will run");
        }
    }
}
