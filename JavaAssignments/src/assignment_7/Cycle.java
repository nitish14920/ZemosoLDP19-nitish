package assignment_7;

public class Cycle {
    public Cycle(){
        System.out.println("This is a Class Cycle");
    }
}
class Unicycle extends Cycle{
    public String balance(){
        return  "Method Balance";
    }
}
class Bicycle extends Cycle{
    public String balance(){
       return  "Method Balance";
    }
}
class Tricycle extends Cycle{

}
