package InputValidator;

public class EmailValidator implements Validator{
    public boolean validate(String message){
        if(message== null) return false;
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)=='@')
                return true;
        }
        return false;
        //return message.contains("@");
    }
}
