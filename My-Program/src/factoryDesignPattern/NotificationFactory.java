package factoryDesignPattern;

public class NotificationFactory {
    public static Inotification getInotification(String type) {
        if(type==null){return null;}
        if(type.equalsIgnoreCase("sms")) {return new SmsNotification();}
        else if(type.equalsIgnoreCase("email")) {return new EmailNotification();}
        else if(type.equalsIgnoreCase("push")) {return new PushNotification();}
        return null;
    }
}
