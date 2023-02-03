package abstractFactoryPattern;

import countries.Belgium_PhoneNumber;
import countries.Germany_PhoneNumber;
import countries.Switzerland_PhoneNumber;

public class PhoneNumber_Factory implements Agenda_AbstractFactory {

	@Override
	public PhoneNumber getPhoneNumber(String country) {
		
		if (country.equalsIgnoreCase("Belgium")) {
			return new Belgium_PhoneNumber();
		} else if (country.equalsIgnoreCase("Switzerland")) {
			return new Switzerland_PhoneNumber();
		} else if (country.equalsIgnoreCase("Germany")) {
			return new Germany_PhoneNumber();
		}
		
		return null;
	}

	@Override
	public Address getAddress(String country) {
		return null;
	}

}
