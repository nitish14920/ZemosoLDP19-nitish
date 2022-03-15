package solid.srp;

public class SrpMain {
    public static void main(String[] args) {
        Patient p = new Patient("Nitish","Nit",1);
        System.out.println(p.getPatient_name());

        Printer printer = new Printer(p);
        System.out.println(printer.getPatient_id());

    }
}
