package commandPattern;

public class Plane extends Vehicle {

	public void boot() {
		System.out.println("The plane is booting");
	}
	
	public void accelerate() {
		System.out.println("The plane is accelerating");
	}
	
	public void stop() {
		System.out.println("The plane is stopping");
	}
}
