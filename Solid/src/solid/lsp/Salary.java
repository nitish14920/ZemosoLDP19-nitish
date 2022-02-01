package solid.lsp;

public class Salary implements HomeAllowance,MedicalAllowance,LunchAllowance{
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
}
