package assignment_7.CycleFactory;

public class Bicycles implements Cycles {
    String name;
    public  Bicycles(String s){
        this.name = s;
    }
    @Override
    public String  getDetails() {
        return "Name of this Bicycle is " + name;
    }
}
