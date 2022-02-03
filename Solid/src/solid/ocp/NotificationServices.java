package solid.ocp;

public abstract class NotificationServices {
    int phoneNo;
    String email;

    public abstract void sendOTP();

}
class EmailNotification extends NotificationServices{

    @Override
    public void sendOTP() {
        System.out.println("OTP sent");
    }
    public void sendEmail(){
        System.out.println("Email sent");
    }
}
