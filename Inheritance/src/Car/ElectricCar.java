package Car;

public class ElectricCar extends Vehicle{
    private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int batteryCapacity){
        super(make,model,year);
        this.batteryCapacity=batteryCapacity;
    }

    @Override
    public void start(){
        System.out.println("Start Electric car");
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }
}
