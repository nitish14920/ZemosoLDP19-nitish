package assignment_5.main;

import assignment_5.data.Data;
import assignment_5.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.print();
        data.print2();

        Singleton singleton = new Singleton();
        singleton.print();
        Singleton.initialize("hello");
    }
}
