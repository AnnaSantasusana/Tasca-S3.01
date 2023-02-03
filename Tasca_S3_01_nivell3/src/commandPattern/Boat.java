package commandPattern;

public class Boat extends Vehicle {

	public void boot() {
		System.out.println("The boat is booting");
	}
	
	public void accelerate() {
		System.out.println("The boat is accelerating");
	}
	
	public void stop() {
		System.out.println("The boat is stopping");
	}
}
