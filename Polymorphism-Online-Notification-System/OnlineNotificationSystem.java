
//✅2️⃣ Online Notification System

// Concepts: Polymorphism through overridden methods
// Description:
// Create class Notification with method send(String message).
// Child classes:
// EmailNotification
// SMSNotification
// PushNotification
// Each should send the notification differently.

class Notification{
  void message(){
    System.out.println("Notification....");
  }
}

class EmailNotification extends Notification{
    @Override
    void message(){
        System.out.println("Email Notification.......");
    }
}
class SMSNotification extends Notification{
    @Override
    void message(){
        System.out.println("SMS Notification.........");
    }
}
class PushNotification extends Notification{
    @Override
    void message(){
        System.out.println("Pushed Notification........");
    }
}

class OnlineNotificationSystem{
    public static void main(String[] args) {
        Notification n1=new EmailNotification();
        Notification n2=new SMSNotification();
        Notification n3=new PushNotification();
        n1.message();
        n2.message();
        n3.message();
    }

}