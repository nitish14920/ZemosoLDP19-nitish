package assignment_7;

public abstract class Rodent {
    public abstract void eat();
    public  abstract void run();

    public Rodent(){
        System.out.println("This is Rodent Class");
    }

}
 class Rat extends Rodent{

     @Override
     public void eat() {
         System.out.println("Eating Cheese");
     }

     @Override
     public void run() {
         System.out.println("Rat running");
     }
 }
 class Hamster extends Rodent{

     @Override
     public void eat() {

     }

     @Override
     public void run() {

     }
 }
