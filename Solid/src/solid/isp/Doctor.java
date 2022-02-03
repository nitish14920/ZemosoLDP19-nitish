package solid.isp;

public class Doctor implements HomeAllowance,MedicalAllowance,LunchAllowance,ConveyanceAllowance{
    double basic_Salary;

    @Override
    public double homeAllowance() {
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

    @Override
    public double conveyanceAllowance() {
        return 0;
    }
}
