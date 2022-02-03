public class MobileFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case NOKIA : return new Nokia("8gb","MediaTek 990");
            case ONEPLUS : return new OnePlus("16gb","SnapDragon 885" );
        }
        return null;
    }
}
