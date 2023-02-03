package countries;

import java.util.HashMap;

import abstractFactoryPattern.Address;

public class Belgium_Address implements Address {

	private static HashMap<String, String> belgiumAddressAgenda = new HashMap<>();
	private static final String COUNTRY = "Belgium";
	
	@Override
	public void addAddress(String user, String address, String zipCode) {
		String completeAddress = address + ", " + zipCode + ", " + COUNTRY;
		belgiumAddressAgenda.put(user, completeAddress);
		System.out.println("User: " + user + " - Address: " + completeAddress 
				+ "\nThe registration has been done correctly");
	}

}
