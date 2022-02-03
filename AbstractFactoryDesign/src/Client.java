public class Client {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());

        AbstractDeviceFactory mobileFactory = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY);
        Device nokia = mobileFactory.getGadget(DeviceType.NOKIA);

        System.out.println(nokia.getDetails());
    }
}
