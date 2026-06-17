package InputValidator;

import java.util.ArrayList;

public class RegistrationService {
    private ArrayList<Validator> validatorList = new ArrayList<>();

    public RegistrationService(ArrayList<Validator> validatorList){
        this.validatorList=validatorList;
    }

    public void setValidatorList(ArrayList<Validator> validatorList) {
        this.validatorList = validatorList;
    }

    public boolean register(String input){
        for(int i=0;i<validatorList.size();i++)
        {
            if(validatorList.get(i).validate(input)==false)
                return false;
        }
        return true;
    }
}
