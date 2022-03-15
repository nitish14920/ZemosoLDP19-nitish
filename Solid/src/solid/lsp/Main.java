package solid.lsp;

public class Main {
    public static void main(String[] args) {
        HospitalFacilites hospitalFacilites = new HospitalFacilites();
        hospitalFacilites.creditSalary();

         hospitalFacilites = new DoctorFacilites();
        hospitalFacilites.creditSalary();
    }
}
