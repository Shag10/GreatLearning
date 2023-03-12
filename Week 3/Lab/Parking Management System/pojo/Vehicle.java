package pojo;
import java.time.LocalTime;
public class Vehicle {
	String vehicleno;
	LocalTime entryTime;
	LocalTime exitTime;
	int slotno;
	String type;
	

	public Vehicle(String vehicleno, LocalTime entryTime, LocalTime exitTime, int slotno,String type) {
		
		this.vehicleno = vehicleno;
		if(vehicleno.length()!=5 || vehicleno.charAt(0)!='A' || vehicleno.charAt(1)!='P') {
			throw new VehicleNumberFormatException("Enter valid vehicle number");
		}
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.slotno = slotno;
		this.type=type;
	}
	
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public LocalTime getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(LocalTime entryTime) {
		this.entryTime = entryTime;
	}
	public LocalTime getExitTime() {
		return exitTime;
	}
	public void setExitTime(LocalTime exitTime) {
		this.exitTime = exitTime;
	}
	public int getSlotno() {
		return slotno;
	}
	public void setSlotno(int slotno) {
		this.slotno = slotno;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}

