package solid.isp;

public class Nurse implements ConveyanceAllowance,LunchAllowance,MedicalAllowance{
    @Override
    public double conveyanceAllowance() {
        return 1500;
    }

    @Override
    public double lunchAllowance() {
        return 2000;
    }

    @Override
    public double medicalAllowance() {
        return 6000;
    }
}
