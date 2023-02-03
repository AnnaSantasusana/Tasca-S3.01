package commandPattern;

public class BootImpl implements IOperation {

	private Vehicle vehicle;
	
	public BootImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.boot();
		
	}

}
