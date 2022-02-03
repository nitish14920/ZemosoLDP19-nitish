package solid.dip;

public class Staff {
    Employee employee1;
    Employee employee2;
    void addStaff(AdminStaff newCashier,MedicalStaff newDoctor){

        this.employee1 = newCashier;
        this.employee2 = newDoctor;
    }
}

interface Employee{
    public void work();
    public void printDetails();
}
class MedicalStaff implements Employee{

    @Override
    public void work() {

    }

    @Override
    public void printDetails() {

    }
}

class AdminStaff implements Employee{

    @Override
    public void work() {

    }

    @Override
    public void printDetails() {

    }
}