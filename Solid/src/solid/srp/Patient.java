package solid.srp;

public class Patient {
    String patient_name;
    String patient_id;
    String admission_no;

    public void addPatient(){
        //code to add patients in hospital
    }

}

class Printer{
    public void printPatientDetails(){
        // code for printing patient details
    }
}
class Cashier{

    private int amountCharged;
    private int amountPaid;

    public void setCharges(int amountCharged,int amountPaid){
        //code to set charges
    }

    public int getBalance(String patient_id){
        return amountCharged - amountPaid;
    }
}
