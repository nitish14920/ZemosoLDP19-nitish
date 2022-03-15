package solid.isp;

public class Doctor implements HomeAllowance,MedicalAllowance,LunchAllowance,ConveyanceAllowance{
    double basic_Salary;

    @Override
    public double homeAllowance() {
        return 14000;
    }

    @Override
    public double lunchAllowance() {
        return 3000;
    }

    @Override
    public double medicalAllowance() {
        return 12000;
    }

    @Override
    public double conveyanceAllowance() {
        return 3000;
    }
}
