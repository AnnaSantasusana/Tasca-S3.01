package countries;

import java.util.HashMap;

import abstractFactoryPattern.PhoneNumber;

public class Germany_PhoneNumber implements PhoneNumber {

	private static HashMap<String, String> germanyPhoneAgenda = new HashMap<>();
	private static final String PREFIX = "49";

	@Override
	public void addPhoneNumber(String user, String phone) {
		String phoneNumber = PREFIX + phone;
		germanyPhoneAgenda.put(user, phoneNumber);
		System.out.println("User: " + user + " - Phone number: " + phoneNumber 
				+ "\nThe registration has been done correctly");
	}
}
