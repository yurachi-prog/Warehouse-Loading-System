package main_package;

import java.util.ArrayDeque;
import java.util.Scanner;

public class main_file {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayDeque<warehouse> warehouseStack = new ArrayDeque<>();
		ArrayDeque<truck> truckQueue = new ArrayDeque<>();
		
		int choice;
		do {
			System.out.println("\n === Warehouse Loading System ===");
			System.out.println("[1] Store item (push");
			System.out.println("[2] View warehouse stack");
			System.out.println("[3] Register arriving truck (enqueue}");
			System.out.println("[4] View waiting trucks");
			System.out.println("[5] Load next truck (pop item + poll truck");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter product code: ");
				String code = sc.nextLine();
				System.out.println("Enter product name:");
				String name = sc.nextLine();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				
				sc.nextLine();
					warehouse wh = new warehouse(code, name, quantity);
					warehouseStack.push(wh);
					System.out.print("Stored:" + wh);
					break;
					
			case 2:
				System.out.println("\nTOP --->");
					for (warehouse whouse: warehouseStack) {
						System.out.println(whouse);
					}
						System.out.println("<--- BOTTOM");
						break;
			
			case 3: 
				System.out.println("Enter plate number:");
				String plate = sc.nextLine();
				System.out.println("Enter truck driver:");
				String driver = sc.nextLine();
				
					truck tk = new truck(plate, driver);
					truckQueue.offer(tk);
					System.out.println("Registered:" + tk);
					break;
					
			case 4:
				System.out.println("\nFRONT --->");
				for (truck tkc: truckQueue) {
					System.out.println(tkc);
				}
					System.out.println("<--- REAR");
					break;
						
			 case 5:
                 if (warehouseStack.isEmpty() || truckQueue.isEmpty()) {
                     System.out.println("Cannot load: Missing container or ship.");
                 } else {
                     warehouse loadedContainer = warehouseStack.pop();
                     truck loadingShip = truckQueue.poll();
                     System.out.println("Loaded: " + loadedContainer + "--->" + loadingShip);
                     System.out.println("Remaining containers: " + warehouseStack.size());
                     System.out.println("Remaining ships waiting: " + truckQueue.size());
                 }
                 break;
			
			 case 0:
				 System.out.print("Exiting the program");
				 default:
					 System.out.print("Invalid choice");
				
				
				
			} 
			
			
		
		

	}while (choice !=0);
	sc.close();
	

}
}


