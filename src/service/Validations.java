package service;

import java.util.Scanner;

public class Validations {
		static Scanner sc;
		static boolean run;

		public String validinput() {
			sc = new Scanner(System.in);
			String input = sc.nextLine();
			return input;
		}

		public String validVehicleNumber() {
			run = true;
			String vehNum = "";
			int sum = 0;
			while (run == true) {
				sc = new Scanner(System.in);
				vehNum = sc.nextLine();
				if (vehNum.length() == 8) {
					if (vehNum.charAt(0) >= 'A' && vehNum.charAt(1) <= 'z') {
						for (int i = 2; i < 8; i++) {
							sum = sum + (int) vehNum.charAt(i) - 48;

						}
						if (sum >= 0 && sum <= 63) {
							run = false;
						}
					}
				} else
					System.out.println("Invalid Vehicle number");
			}
			return vehNum;

		}

		public int ageValidation() {
			// TODO Auto-generated method stub
			run = true;
			int inputInteger = 0;
			while (run == true) {
				sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					inputInteger = sc.nextInt();
					if (inputInteger < 0 || inputInteger > 200) {
						System.out.println("Invalid age");
						continue;
					}
					run = false;
				} else {
					System.out.println("Invalid input");
					sc.next();
				}
			}

			return inputInteger;
		}

		public String dateValidation() {

			String date = "";
			run = true;
			while (run == true) {
				sc = new Scanner(System.in);

				date = sc.nextLine();
				if (checkDate(date) == true) {
					run = false;
				}

				else {
					System.out.println("Enter again invalid date");
				}
			}
			return date;

		}

		public static boolean checkDate(String date) {
			// TODO Auto-generated method stub
			if (date.length() == 10 && date.charAt(2) == '/' && date.charAt(5) == '/') {
				int dd = ((int) date.charAt(0) - 48) * 10 + (int) date.charAt(1) - 48;
				int mm = ((int) date.charAt(3) - 48) * 10 + (int) date.charAt(4) - 48;
				int yyyy = ((int) date.charAt(6) - 48) * 1000 + ((int) date.charAt(7) - 48) * 100
						+ ((int) date.charAt(8) - 48) * 10 + (int) date.charAt(9) - 48;
				if (yyyy > 2000 && yyyy<=2021) {
					if (checkDateMon(dd, mm, yyyy) == true)
						return true;

				}

			}
			return false;
		}

		public static boolean checkDateMon(int dd, int mm, int yyyy) {
			// TODO Auto-generated method stub
			int leap = 0;

			if ((yyyy % 4 == 0 && yyyy % 100 != 0) && (yyyy % 400 == 0)) {
				leap = 1;
			}
			if ((mm >= 1 && mm <= 12) && (dd >= 1 && dd <= 31)) {
				if (mm == 2 && leap == 1 && (dd >= 1 && dd <= 29)) {
					return true;
				} else if (mm == 2 && leap == 0 && (dd >= 1 && dd <= 28)) {
					return true;
				} else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && (dd >= 1 && dd <= 30)) {
					return true;
				} else {
					if (dd >= 1 && dd <= 31)
						return true;
				}
			}

			return false;

		}

		public String timeValidation() {
			String time = null;
			run = true;
			while (run == true) {
				sc = new Scanner(System.in);
				time = sc.nextLine();
				if (checkTime(time) == true) {
					run = false;
				} else {
					System.out.println("Invalid time no enter again");

				}

			}
			return time;
		}

		public static boolean checkTime(String time) {
			// TODO Auto-generated method stub
			int hr = ((int) time.charAt(0) - 48) * 10 + (int) time.charAt(1) - 48;
			int min = ((int) time.charAt(3) - 48) * 10 + (int) time.charAt(4) - 48;
			if (!((hr >= 0 && hr <= 24) && (min >= 0 && min <= 59) && (time.charAt(2) == ':')))
				return false;

			return true;
		}

		public int integerValidation() {
			// TODO Auto-generated method stub
			run = true;
			int inputInteger = 0;
			while (run == true) {
				sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					inputInteger = sc.nextInt();
					if (inputInteger < 0) {
						System.out.println("Can't be negative");
						continue;
					}
					run = false;
				} else {
					System.out.println("Invalid input");
				}
			}

			return inputInteger;
		}

		public double doubleValidation() {
			// TODO Auto-generated method stub
			run = true;
			double inputDouble = 0;
			while (run == true) {
				if (sc.hasNextInt()) {
					inputDouble = sc.nextInt();
					if (inputDouble < 0) {
						System.out.println("Can't be negative");
						continue;
					}
					run = false;
				} else {
					System.out.println("Invalid input");
					sc.next();
				}
			}

			return inputDouble;
		}

		public String mobileValidation() {
			String inputMobile = null;
			run = true;
			while (run == true) {
				sc = new Scanner(System.in);
				inputMobile = sc.nextLine();
				if (checkMobile(inputMobile) == true) {
					run = false;
				} else {
					System.out.println("Invalid Date no enter again");

				}

			}
			return inputMobile;

		}

		public static boolean checkMobile(String inputMobile) {
			// TODO Auto-generated method stub
			if (inputMobile.length() == 10) {
				for (int i = 0; i < inputMobile.length(); i++) {
					if (!(inputMobile.charAt(i) >= '0' && inputMobile.charAt(i) <= '9')) {
						return false;
					}
				}
			} else
				return false;

			return true;

		}
	}



