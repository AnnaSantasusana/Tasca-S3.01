package singletonPattern;

import java.util.ArrayList;

public class Undo {

	private static Undo instance;
	private static ArrayList<String> orders = new ArrayList<>();
	
	private Undo() {
		
	}
	
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	
	public void addOrder(String order) {
		orders.add(order);
	}
	
	public void undoCommand(String order) {
		orders.remove(orders.size() -1);
	}
	
	public void listOrders() {
		
		final int MAX_ORDERS = 5;
		int counter = 0;
	
		while (counter < orders.size() && counter < MAX_ORDERS) {
			System.out.println(orders.get(counter));
			counter ++;
		}
		
	}
}
