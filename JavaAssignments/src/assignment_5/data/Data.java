package assignment_5.data;

public class Data {
    int a;
    char b;

    public void print(){
        System.out.println(a);
        System.out.println(b);
    }
    public void print2(){
        int c;
        char d;
       // System.out.println(c);
       // System.out.println(d);
        //This throws error because unlike fields local variables does not assign a default value
    }
}
