package Car;

import java.util.Scanner;

public class MachineMain {
    public void execute(){
        Scanner sc =new Scanner(System.in);
        System.out.println("1.electric , 2.gas");
        int in= sc.nextInt();
        Machine machine= switch (in){
            case 1-> new ElectricCar("machine","Electric car",2026,100);
            case 2-> new GasCar("machine","gas car", 2026,100);
            default -> {
                System.out.println("enter 1 or 2 only");
                yield null;
            }
        };
        MachineOperationService machineOperation = new MachineOperationService(machine);
        machineOperation.run();
    }
}
