package service;

import entity.Parking;

public class ParkingOperations {
	Validations valid = new Validations();

	public double exitParking(Parking[] parking) {
		// TODO Auto-generated method stub
		int present = 0;
		String intime = "";
		// sc.nextLine();
		System.out.println("Enter vehicle number");
		String vehNum = "";
		vehNum = valid.validVehicleNumber();
		// System.out.println(parking[0].getVehicleNumber().compareTo(vehNum));
		for (int i = 0; i < parking.length; i++) {

			if (parking[i] != null) {

				if (vehNum.compareTo(parking[i].getVehicleNumber()) == 0) {
					intime = parking[i].getTimein();
					parking[i] = null;
					present = 1;
					break;

				}
			}
		}
		double amount = 0;
		if (present == 1) {
			System.out.println("Enter timeout");
			String timeout = valid.timeValidation();

			int hr1 = ((int) intime.charAt(0) * 10 + (int) intime.charAt(1));

			int hr2 = ((int) timeout.charAt(0) * 10 + (int) timeout.charAt(1));
			if (hr2-hr1 < 0) {
				System.out.println("Wrong time out");
			}
			else if (hr2-hr1 >= 2)
				amount = 50 + (hr2-hr1 - 2) * 30;
			else
				amount = 50;

		} else {
			System.out.println("Not in the list");
		}
		return amount;

	}

	/*
	 * private static String subString(String time, int low, int high) { // TODO
	 * Auto-generated method stub String str = ""; while (low <= high) { str = str +
	 * time.charAt(low); low++; }
	 * 
	 * System.out.println(str + " "); return str; }
	 */

	public void bookParking(Parking[] parking, int i) {
		// TODO Auto-generated method stub
		System.out.println("Enter vehicle Number");
		String vehicleNumber = valid.validVehicleNumber();
		System.out.println("ENter time in");
		String timein = valid.timeValidation();
		parking[i] = new Parking(vehicleNumber, timein);

	}

}
