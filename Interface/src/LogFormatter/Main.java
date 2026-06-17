package LogFormatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new JsonFormatter();
        Logger logger = new Logger(formatter);
        String message = "Application_Logs:The logs are here";
        logger.sendLog(message);
    }
}
