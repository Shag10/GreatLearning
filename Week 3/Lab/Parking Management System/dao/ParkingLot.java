package dao;

import pojo.Vehicle;
import pojo.Car;

import java.util.HashSet;

import pojo.Bike;

public class ParkingLot {
	public HashSet<String> hset=new HashSet<>();
	public void vehicleEntry(String vehicleno, String vehicletype) {
		String vehicleentry=vehicleno+" "+vehicletype;
		hset.add(vehicleentry);
		System.out.println(vehicleno+" of type "+vehicletype+" is entered in the parking lot");
	}
	public void vehicleExit(Vehicle v) {
		String str=v.getVehicleno()+" "+v.getType();
		hset.remove(str);
		v=null;
		System.out.println(v);
		
	}
	public float computeCost(Vehicle v) {
		int noOfHours=v.getExitTime().getHour()-v.getEntryTime().getHour();
		float cost=0.0f;
		if(v instanceof Bike) {
	    cost=noOfHours*((Bike)(v)).getCostPerHour();
		}
		else if(v instanceof Car)
		{
			 cost=noOfHours*((Car)(v)).getCostPerHour();
		}
		else
		{
			throw new NotImplementedException("this vehicle type is not permitted to park");
		}
		
		return cost;
		
	}

}
