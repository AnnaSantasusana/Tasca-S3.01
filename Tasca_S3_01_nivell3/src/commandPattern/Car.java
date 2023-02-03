package commandPattern;

public class Car extends Vehicle {

	public void boot() {
		System.out.println("The car is booting");
	}
	
	public void accelerate() {
		System.out.println("The car is accelerating");
	}
	
	public void stop() {
		System.out.println("The car is stopping");
	}
}
