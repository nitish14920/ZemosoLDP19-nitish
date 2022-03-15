package solid.srp;

public class Printer {
    Patient p;

    public Printer(Patient patient) {
        this.p = patient;
    }

    public String getPatient_id() {
        return p.getPatient_id();
    }
}
