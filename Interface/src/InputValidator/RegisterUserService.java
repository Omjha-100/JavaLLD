package InputValidator;

import java.util.ArrayList;

public class RegisterUserService {
    private ArrayList<Validator> emailValidatorList;
    private ArrayList<Validator> passwordValidatorList;

    public RegisterUserService(ArrayList<Validator> emailValidatorList, ArrayList<Validator> passwordValidatorList){
        this.emailValidatorList=emailValidatorList;
        this.passwordValidatorList=passwordValidatorList;
    }

    public boolean register(User user){
         if(user == null) return false;

         RegistrationService registrationService = new RegistrationService(emailValidatorList);
         boolean isEmailSuccessful = registrationService.register(user.getEmail());

         registrationService.setValidatorList(passwordValidatorList);
         boolean isPasswordSuccessful = registrationService.register(user.getPassword());

         return isEmailSuccessful && isPasswordSuccessful;

    }
}
