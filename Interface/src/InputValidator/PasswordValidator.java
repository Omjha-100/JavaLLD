package InputValidator;

public class PasswordValidator implements Validator{
    public boolean validate(String message){
        if(message==null)return false;
        if(message.length()>8)return true;
        return false;
    }
}
