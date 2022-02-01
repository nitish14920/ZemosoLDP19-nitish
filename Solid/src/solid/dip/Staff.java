package solid.dip;

public class Staff {
    Employee employee;

    void addStaff(AdminStaff newCashier){
        this.employee = newCashier;
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