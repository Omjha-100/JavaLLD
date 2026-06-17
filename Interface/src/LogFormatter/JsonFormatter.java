package LogFormatter;

public class JsonFormatter implements Formatter{
    public void format(String message){
        System.out.println("formatted according to Json "+message);
    }
}
