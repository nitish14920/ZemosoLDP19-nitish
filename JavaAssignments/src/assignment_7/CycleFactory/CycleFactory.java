package assignment_7.CycleFactory;

public class CycleFactory {


    public static Cycles getCycle( CycleType cycleType){
        switch (cycleType){
            case BICYCLE : return new Bicycles("Hero");

            case TRICYCLE: return new Tricycles("Auto");

            case UNICYCLE:return new Unicycles("Unknown");

        }
        return null;
    }
}
