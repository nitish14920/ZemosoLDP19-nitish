package assignment_7;

public class Main {
    public static void main(String[] args) {
        Rodent rat = new Rat();
        Rodent hamster = new Hamster();
        Rodent[] arr = new Rodent[2];
        arr[0] = rat;
        arr[1] = hamster;

        System.out.println(arr);


        // Cycle Class

        Cycle[] arr2 =  new Cycle[3];
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        arr2[0] =  bicycle;
        arr2[1] =  tricycle;
        arr2[2] =  unicycle;

        System.out.println(((Bicycle)arr2[0]).balance());
    }
}
