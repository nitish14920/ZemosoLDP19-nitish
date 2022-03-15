package solid.srp;

public class Patient {
    String patient_name;
    String patient_id;
    int admission_no;

    public Patient(String patient_name, String patient_id, int admission_no) {
        this.patient_name = patient_name;
        this.patient_id = patient_id;
        this.admission_no = admission_no;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public int getAdmission_no() {
        return admission_no;
    }

}

