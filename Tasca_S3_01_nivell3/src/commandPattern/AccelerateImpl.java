package commandPattern;

public class AccelerateImpl implements IOperation {

	private Vehicle vehicle;
	
	public AccelerateImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.accelerate();
		
	}

}
