package abstractFactoryPattern;

public class FactoryProducer {

	public static Agenda_AbstractFactory getFactory (String factoryType) {
		
		if (factoryType.equalsIgnoreCase("Address")) {
			return new Address_Factory();
		} else if (factoryType.equalsIgnoreCase("PhoneNumber")) {
			return new PhoneNumber_Factory();
		}
		
		return null;
	}
}
