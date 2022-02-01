package withoutsolid.dip;

public class Staff {
    MedicalStaff doctor;
    AdminStaff cashier;
    public Staff(MedicalStaff newDoctor,AdminStaff newCashier){
        this.doctor = newDoctor;
        this.cashier = newCashier;
    }
}

class MedicalStaff{
    void work(){

    }
    void printDetails(){

    }
}

class AdminStaff{
    void work(){

    }
    void printDetails(){

    }
}
