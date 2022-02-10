package assignment_5.singleton;

public class Singleton {
    String a;

    public static void initialize(String b){
        //this.a = b;
        // this refers to current instance of the class but in static method class instance will not have access to it.
    }
    public void print(){
        System.out.println(a);
    }
}
