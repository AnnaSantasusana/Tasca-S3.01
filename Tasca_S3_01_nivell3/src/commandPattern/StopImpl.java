package commandPattern;

public class StopImpl implements IOperation {

	private Vehicle vehicle;
	
	public StopImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.stop();
		
	}

}
