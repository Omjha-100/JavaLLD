package NotificationService;

public class EmailNotifier implements NotificationService{
    public void sendNotification(String recipient, String message){
        System.out.println("Sending Notification on Email to " +recipient+" | "+message);
    }
}
