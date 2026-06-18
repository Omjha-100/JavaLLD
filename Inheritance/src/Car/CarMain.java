package Car;

import java.util.Scanner;

public class CarMain {
//    public void execute(){
//        System.out.println("1.electric or 2.gas");
//        Scanner sc= new Scanner(System.in);
//        int input = sc.nextInt();
//        switch(input){
//            case 1:
//                executeElectricCar();
//                break;
//            case 2:
//                executeGasCar();
//                break;
//            default:
//                System.out.println("Enter 1 or 2 only");
//                break;
//        }
//    }
//
//    private void executeElectricCar(){
//        ElectricCar eCar = new ElectricCar("mahindra", "xuv", 2026,100);
//        eCar.start();
//        eCar.stop();
//        eCar.showDetails();
//    }
//
//    private void executeGasCar(){
//        GasCar gCar = new GasCar("Toyota", "LC", 2026,100);
//        gCar.start();
//        gCar.stop();
//        gCar.showDetails();
//    }

    public void execute() {
        System.out.println("1.electric or 2.gas");
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            Vehicle vehicle = switch (input) {
                case 1 -> new ElectricCar("mahindra", "xuv", 2026, 100);
                case 2 -> new GasCar("Toyota", "LC", 2026, 100);
                default -> {
                    System.out.println("Enter 1 or 2 only");
                    yield null;
                }
            };
            if (vehicle != null) {
                vehicle.start();
                vehicle.stop();
                vehicle.showDetails();
                if (vehicle instanceof ElectricCar) {
                    System.out.println("Battery capacity: " + ((ElectricCar) vehicle).getBatteryCapacity());
                } else if (vehicle instanceof GasCar) {
                    System.out.println("Fuel capacity: " + ((GasCar) vehicle).getFuelCapacity());
                }
            }
        }
    }
}
