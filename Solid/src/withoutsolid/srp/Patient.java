package withoutsolid.srp;

public class Patient {
    String patient_name;
    String patient_id;
    String admission_no;

    private int amountCharged;
    private int amountPaid;

    public void printPatientDetails(){
        // code for printing patient details
    }

    public void addPatient(){
        //code to add patients in hospital
    }

    public void setCharges(int amountCharged,int amountPaid){

        //code to set charges
    }
    public int getBalance(String patient_id){
        return amountCharged - amountPaid;
    }
}
