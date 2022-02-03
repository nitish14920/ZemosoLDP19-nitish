package solid.isp;

public class Nurse implements ConveyanceAllowance,LunchAllowance,MedicalAllowance{
    @Override
    public double conveyanceAllowance() {
        return 0;
    }

    @Override
    public double lunchAllowance() {
        return 0;
    }

    @Override
    public double medicalAllowance() {
        return 0;
    }
}
