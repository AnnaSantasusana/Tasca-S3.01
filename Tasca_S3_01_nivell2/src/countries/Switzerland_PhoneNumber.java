package countries;

import java.util.HashMap;

import abstractFactoryPattern.PhoneNumber;

public class Switzerland_PhoneNumber implements PhoneNumber {

	
	private static HashMap<String, String> switzerlandPhoneAgenda = new HashMap<>();
	private static final String PREFIX = "41";
	
	@Override
	public void addPhoneNumber(String user, String phone) {
		String phoneNumber = PREFIX + phone;
		switzerlandPhoneAgenda.put(user, phoneNumber);
		System.out.println("User: " + user + " - Phone number: " + phoneNumber 
				+ "\nThe registration has been done correctly");
	}
	
}
