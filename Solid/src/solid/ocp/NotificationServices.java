package solid.ocp;

public abstract class NotificationServices {
    int phoneNo;
    String email;

    public abstract void sendOTP();

}
class EmailNotification extends NotificationServices{

}
