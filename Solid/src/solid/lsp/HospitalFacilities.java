package solid.lsp;

public interface HospitalFacilities {
    public void foodServices();
    public void creditSalary();

}

class AmbulanceDriver implements HospitalFacilities{

    @Override
    public void foodServices() {

    }

    @Override
    public void creditSalary() {

    }

    public void incentives(){}
}
class Doctor implements HospitalFacilities{

    @Override
    public void foodServices() {

    }

    @Override
    public void creditSalary() {

    }
    public void wifi(){}

    public void transportServices(){}
}
