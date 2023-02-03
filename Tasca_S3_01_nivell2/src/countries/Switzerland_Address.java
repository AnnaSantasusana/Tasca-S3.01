package countries;

import java.util.HashMap;

import abstractFactoryPattern.Address;

public class Switzerland_Address implements Address {

	private static HashMap<String, String> switzerlandAddressAgenda = new HashMap<>();
	private static final String COUNTRY = "Switzerland";
	
	@Override
	public void addAddress(String user, String address, String zipCode) {
		String completeAddress = address + ", " + zipCode + ", " + COUNTRY;
		switzerlandAddressAgenda.put(user, completeAddress);
		System.out.println("User: " + user + " - Address: " + completeAddress 
				+ "\nThe registration has been done correctly");
	}

}
