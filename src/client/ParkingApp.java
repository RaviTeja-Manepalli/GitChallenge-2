package client;

//1 

import java.util.Scanner;
import service.Validations;
import service.ParkingOperations;
import entity.Parking;

public class ParkingApp {
	static Scanner sc = new Scanner(System.in);
	static Validations valid = new Validations();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking parking[] = new Parking[100];
		ParkingOperations parkOperations = new ParkingOperations();

		// Parking p=new Parking();
		int choice = 0;
		do {
			System.out.println("1. BookParking ");
			System.out.println("2. Parking fee to exit");
			System.out.println("3. Exit program");
			System.out.println("Enter choice");
			choice = valid.integerValidation();
			switch (choice) {
			case 1:
				boolean checkAvailable = false;
				for (int i = 0; i < parking.length; i++) {
					if (parking[i] == null) {
						parkOperations.bookParking(parking, i);
						checkAvailable = true;
						break;
					}
				}
				if (checkAvailable == false) {
					System.out.println("Parking slots are filled");

				}

				break;

			case 2:
				if(parking!=null)
				{
				double parkingAmount = parkOperations.exitParking(parking);
				System.out.println(parkingAmount);
				}
				else {
					System.out.println("No details");
				}
				break;

			case 3:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Invalid input");
			}

		} while (choice != 4);

	}
}
