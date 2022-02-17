public class Singleton {
    public static void main(String[] args) {

//        Abc obj1 = new Abc();
//        Abc obj2 = new Abc();

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

    }
}
class Abc{
    private static Abc obj = new Abc();

    private Abc(){
        System.out.println("Instance created");
    }
    public static Abc getInstance(){
        return obj;
    }
}
