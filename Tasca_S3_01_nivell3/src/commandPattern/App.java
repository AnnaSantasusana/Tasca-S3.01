package commandPattern;

public class App {

	public static void main(String[] args) {
	
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Plane plane = new Plane();
		Boat boat = new Boat();
		
		AccelerateImpl accCar = new AccelerateImpl(car);
		StopImpl stopBicycle = new StopImpl(bicycle);
		BootImpl bootPlane = new BootImpl(plane);
		AccelerateImpl accBoat = new AccelerateImpl(boat);
		
		Invoker ivk = new Invoker();
		ivk.receiveOperation(accCar);
		ivk.receiveOperation(stopBicycle);
		ivk.receiveOperation(bootPlane);
		ivk.receiveOperation(accBoat);
		
		ivk.performOperations();

	}

}
