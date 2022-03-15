package withoutsolid.ocp;

class MessageNotification  {

    int mobileNo;

    public MessageNotification(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void sendNotification(){
        System.out.println("Message Sent to Number: " + mobileNo);
    }

}
class CallNotification {
    int mobileNo;
    public CallNotification(int mobileNo) {
        int mobileNo1 = this.mobileNo;
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

