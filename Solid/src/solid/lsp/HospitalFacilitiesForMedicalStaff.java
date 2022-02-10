package solid.lsp;

public interface HospitalFacilitiesForMedicalStaff {
    public void foodServices();
    public void creditSalary();
    public void wifi();

}

class AmbulanceDriver implements HospitalFacilitiesForMedicalStaff {

    @Override
    public void foodServices() {

    }

    @Override
    public void creditSalary() {

    }

    @Override
    public void wifi() {

    }

    public void incentives(){}
}
class Doctor implements HospitalFacilitiesForMedicalStaff {

    @Override
    public void foodServices() {

    }

    @Override
    public void creditSalary() {

    }
    public void wifi(){}

    public void transportServices(){}
}
