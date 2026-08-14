package interfaceinjava;

public class NotificationDemo {
    public static void main(String[] args) {
        Notification notification = new SMSNotification();
        Notification notification2 = new EmailNotification();
        notification.sendNotification();
        notification2.sendNotification();
    }
}
