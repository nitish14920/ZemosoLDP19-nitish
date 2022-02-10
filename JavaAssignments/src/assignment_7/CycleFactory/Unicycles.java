package assignment_7.CycleFactory;

public class Unicycles implements Cycles {
    String name;
    public Unicycles(String s){
        this.name = s;
    }
    @Override
    public String  getDetails() {
        return "Name of this Unicycle is " + name;
    }
}
