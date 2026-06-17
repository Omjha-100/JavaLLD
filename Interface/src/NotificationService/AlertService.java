package NotificationService;

public class AlertService {
    private NotificationService notificationService;

    public AlertService(NotificationService notificationService){
        this.notificationService= notificationService;
    }
    public void setNotificationService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void triggerAlert(String recipient, String message){
        System.out.println("Triggering Alert");
        notificationService.sendNotification(recipient,message);
    }
}
