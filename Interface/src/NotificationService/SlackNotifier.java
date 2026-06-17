package NotificationService;

public class SlackNotifier implements NotificationService{
    public void sendNotification(String recipient,String message){
        System.out.println("Send notification on Slack to" + recipient+" | "+message);
    }
}
