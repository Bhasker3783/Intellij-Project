package factoryDesignPattern;

public class SmsNotification implements Inotification {
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
