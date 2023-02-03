package abstractFactoryPattern;

public interface Agenda_AbstractFactory {

	PhoneNumber getPhoneNumber(String country);
	Address getAddress(String country);
}
