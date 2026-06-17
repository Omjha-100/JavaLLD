package LogFormatter;

public class PlainFormatter implements Formatter{
    public void format(String message){
        System.out.println("Plain Formatting "+ message);
    }
}
