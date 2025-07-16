package factoryDesignPattern;

public class PushNotification implements Inotification {
    @Override
    public void notifyUser() {
        System.out.println("Push Notification");
    }
}