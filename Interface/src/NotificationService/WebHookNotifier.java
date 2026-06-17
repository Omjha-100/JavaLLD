package NotificationService;

public class WebHookNotifier implements NotificationService{
    public void sendNotification(String recipient, String message){
        System.out.println("Sending notification via webHook to "+recipient+" | "+message);
    }
}
