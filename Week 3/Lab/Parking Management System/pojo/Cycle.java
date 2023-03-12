package pojo;
import dao.NotImplementedException;

import java.time.LocalTime;

public class Cycle extends Vehicle{

	public Cycle(String vehicleno, LocalTime entryTime, LocalTime exitTime, int slotno, String type) {
		super(vehicleno, entryTime, exitTime, slotno, type);
		throw new NotImplementedException("this vehicle type is not permitted to park");
		// TODO Auto-generated constructor stub
	}
	

}
