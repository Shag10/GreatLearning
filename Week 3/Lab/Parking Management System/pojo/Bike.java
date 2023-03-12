package pojo;

import java.time.LocalTime;

public class Bike extends Vehicle{

	public Bike(String vehicleno, LocalTime entryTime, LocalTime exitTime, int slotno, String type) {
		super(vehicleno, entryTime, exitTime, slotno, type);
		// TODO Auto-generated constructor stub
	}
	float costPerHour=50;
	public float getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(float costPerHour) {
		this.costPerHour = costPerHour;
	}

}
