package Car;

public class MachineOperationService {
    private Machine machine;

    public MachineOperationService(Machine machine){
        this.machine=machine;
    }
    public void run(){
        machine.start();
        machine.stop();
        machine.showDetails();
    }
}
