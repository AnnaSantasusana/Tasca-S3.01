package countries;

import java.util.HashMap;

import abstractFactoryPattern.Address;

public class Germany_Address implements Address {
	
	private static HashMap<String, String> germanyAddressAgenda = new HashMap<>();
	private static final String COUNTRY = "Germany";
	
	@Override
	public void addAddress(String user, String address, String zipCode) {
		String completeAddress = address + ", " + zipCode + ", " + COUNTRY;
		germanyAddressAgenda.put(user, completeAddress);
		System.out.println("User: " + user + " - Address: " + completeAddress 
				+ "\nThe registration has been done correctly");
	}

}
