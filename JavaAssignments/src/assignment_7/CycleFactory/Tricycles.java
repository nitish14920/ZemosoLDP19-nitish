package assignment_7.CycleFactory;

public class Tricycles implements Cycles {
    String name;
    public  Tricycles(String s){
        this.name = s;
    }
    @Override
    public String  getDetails() {
      return   "Name of this Tricycle is " + name;
    }
}
