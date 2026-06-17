package NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification= new EmailNotifier();
        AlertService emailAlert = new AlertService(emailNotification);
        emailAlert.triggerAlert("om", "email alert triggered");
    }
}
