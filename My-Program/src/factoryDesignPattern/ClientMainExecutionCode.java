package factoryDesignPattern;

public class ClientMainExecutionCode {
    public static void main(String[] args) {
        Inotification inotification = NotificationFactory.getInotification("sms");
        inotification.notifyUser();
    }
}

