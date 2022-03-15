package solid.dip;

public class Staff {

    Employee employee1;
    Employee employee2;
    public  Staff(AdminStaff newCashier,MedicalStaff newDoctor){

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
        System.out.println("Medical Work");
    }

    @Override
    public void printDetails() {
        System.out.println("Print Work");
    }
}

class AdminStaff implements Employee{

    @Override
    public void work() {
        System.out.println("Admit Work");
    }

    @Override
    public void printDetails() {
        System.out.println("Print Work");
    }
}
class Main{
    public static void main(String[] args) {
        MedicalStaff medStaff = new MedicalStaff();
        AdminStaff adminStaff = new AdminStaff();

        Staff staff = new Staff(adminStaff,medStaff);
        staff.employee1.printDetails();
    }
}