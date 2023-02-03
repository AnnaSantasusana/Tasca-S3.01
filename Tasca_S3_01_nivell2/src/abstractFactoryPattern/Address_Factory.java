package abstractFactoryPattern;

import countries.Belgium_Address;
import countries.Germany_Address;
import countries.Switzerland_Address;

public class Address_Factory implements Agenda_AbstractFactory {

	@Override
	public PhoneNumber getPhoneNumber(String country) {
		return null;
	}

	@Override
	public Address getAddress(String country) {
		
		if (country.equalsIgnoreCase("Belgium")) {
			return new Belgium_Address();
		} else if (country.equalsIgnoreCase("Switzerland")) {
			return new Switzerland_Address();
		} else if (country.equalsIgnoreCase("Germany")) {
			return new Germany_Address();
		}
		
		return null;
	}

}
