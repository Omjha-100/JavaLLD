package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("press 1 for car, press 2 for machine");
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();

        switch (input){
            case 1:
                CarMain car = new CarMain();
                car.execute();
                break;

            case 2:
                MachineMain machine = new MachineMain();
                machine.execute();
                break;

            default:
                System.out.println("enter 1 or 2 only");
                break;

        }
    }
}
