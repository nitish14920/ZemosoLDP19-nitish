package assignment_7.CycleFactory;

public class Main {
    public static void main(String[] args) {
        CycleFactory cycleFactory;
        Cycles bicycle = CycleFactory.getCycle(CycleType.BICYCLE);
        System.out.println(bicycle.getDetails());
    }

}
