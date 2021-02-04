package entity;

public class Parking {
	private String timein;
	private String vehicleNumber;

	public Parking() {

	}

	public Parking(String vehicleNumber, String timein) {
		this.timein = timein;
		this.vehicleNumber = vehicleNumber;
	}

	public String getTimein() {
		return timein;
	}

	public void setTimein(String timein) {
		this.timein = timein;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

}
