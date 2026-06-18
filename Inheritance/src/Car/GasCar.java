package Car;

public class GasCar extends Vehicle{
    private int fuelCapacity;

    public GasCar(String make, String model, int year, int fuelCapacity){
        super(make,model,year);
        this.fuelCapacity=fuelCapacity;
    }

    @Override
    public void start(){
        System.out.println("Start gas car");
    }

    public int getFuelCapacity(){
        return this.fuelCapacity;
    }
}
