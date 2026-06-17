package LogFormatter;

public class Logger {
    String message;
    Formatter formatter;

    public Logger(Formatter formatter){
        this.formatter=formatter;
    }
    public void setLogger(Formatter formatter){
        this.formatter=formatter;
    }

    public void sendLog(String message){
        System.out.println("Sending Log");
        formatter.format(message);
    }
}
