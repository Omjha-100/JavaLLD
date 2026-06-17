package InputValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Validator> emailValidatorList =new ArrayList<>();
        ArrayList<Validator> passwordValidatorList =new ArrayList<>();

        emailValidatorList.add(new EmailValidator());
        passwordValidatorList.add(new PasswordValidator());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name ");
        String name= sc.next();

        System.out.println("Enter email ");
        String email = sc.next();

        System.out.println("Enter password ");
        String password = sc.next();

        User user =new User(name, email,password);

        RegisterUserService registerUserService = new RegisterUserService(emailValidatorList,passwordValidatorList);
        boolean isRegistrationSuccessful =registerUserService.register(user);

        if(isRegistrationSuccessful)
            System.out.println("User Registration Successful for "+ user.getName());
        else
            System.out.println("User Registration Failed for "+ user.getName());
    }
}
