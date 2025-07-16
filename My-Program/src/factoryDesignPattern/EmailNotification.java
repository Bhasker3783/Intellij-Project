package factoryDesignPattern;

public class EmailNotification implements Inotification {

    public void notifyUser() {
        System.out.println("Email Notification");
    }
}