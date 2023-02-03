package singletonPattern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		String order = "";
	
		Undo ud = Undo.getInstance();
		
		
		do {
			System.out.println("1. Add an order\n" 
							 + "2. Undo last order\n"
							 + "3. List orders\n"
							 + "4. Exit");
			
			System.out.println("Write one of the options:");
			option = sc.nextInt();
			
			switch(option) {
				case 1: 
					System.out.println("You have selected option 1. Enter the order you want to add:");
					sc.nextLine();
					order = sc.nextLine();
					ud.addOrder(order);
					break;
				case 2: 
					System.out.println("You have selected option 2. The last order has been undone");
					ud.undoCommand(order);
					break;
				case 3: 
					System.out.println("You have selected option 3. The latest orders entered are as follows:");
					ud.listOrders();
					break;
				case 4:
					System.out.println("Bye bye!");
					break;
			}
		}
		while(option != 4);
		

		sc.close();
	}

}
