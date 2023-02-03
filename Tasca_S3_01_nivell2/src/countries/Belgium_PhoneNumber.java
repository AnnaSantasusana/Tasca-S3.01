package countries;

import java.util.HashMap;

import abstractFactoryPattern.PhoneNumber;

public class Belgium_PhoneNumber implements PhoneNumber {

	private static HashMap<String, String> belgiumPhoneAgenda = new HashMap<>();
	private static final String PREFIX = "32";

	@Override
	public void addPhoneNumber(String user, String phone) {
		String phoneNumber = PREFIX + phone;
		belgiumPhoneAgenda.put(user, phoneNumber);
		System.out.println("User: " + user + " - Phone number: " + phoneNumber 
				+ "\nThe registration has been done correctly");
	}
}
