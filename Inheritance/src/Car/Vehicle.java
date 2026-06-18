package Car;

public class Vehicle implements Machine{
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make= make;
        this.model=model;
        this.year=year;
    }

    public void start(){
        System.out.println("Start engine");
    }

    public void stop(){
        System.out.println("Stop engine");
    }
    public void showDetails(){
        System.out.println(this.make);
        System.out.println(this.model);
        System.out.println(this.year);
    }
}
