public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case HP : return new Hp("8gb","Intel i5","AMD");
            case DELL : return new Dell("16gb","Intel i7" , "Nvidia");
        }
        return null;
    }
}
