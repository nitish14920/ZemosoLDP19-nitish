public class Shop {

    public static void main(String[] args) {
        //Phone phone = new Phone("Android",4,"QualComm",6.7,6000);

        Phone phone = new PhoneBuilder().setBattery(5000).getPhone();
        System.out.println(phone);
    }
}
