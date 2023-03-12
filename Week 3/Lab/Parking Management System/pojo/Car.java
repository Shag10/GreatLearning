package pojo;

import java.time.LocalTime;

public class Car extends Vehicle {
	public Car(String vehicleno, LocalTime entryTime, LocalTime exitTime, int slotno, String type) {
		super(vehicleno, entryTime, exitTime, slotno, type);
		// TODO Auto-generated constructor stub
	}
	float costPerHour=70;
	public float getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(float costPerHour) {
		this.costPerHour = costPerHour;
	}
    
}
