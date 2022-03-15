package solid.ocp;

public  class NotificationServices {


    public void sendNotification(){
        System.out.println("Notification Sent");
    }

}
class MessageNotification extends NotificationServices{

    int mobileNo;

    public MessageNotification(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void sendNotification(){
        System.out.println("Message Sent to Number: " + mobileNo);
    }

}
class CallNotification extends MessageNotification {

    public CallNotification(int mobileNo) {
        super(mobileNo);
    }
    public void sendNotification(){
        System.out.println("You'll be getting call on Number: " + mobileNo);
    }

}
class Main{
    public static void main(String[] args) {
        CallNotification call = new CallNotification(9416162);
        call.sendNotification();
    }
}
