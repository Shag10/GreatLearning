package bean;

import java.time.LocalTime;
import java.util.Scanner;

import dao.ParkingLot;
import pojo.Bike;
import pojo.Car;
import pojo.Cycle;
import pojo.Vehicle;

public class Main {
	public static void main(String[] args) {
		Vehicle v[]=new Vehicle[10];
		ParkingLot p=new ParkingLot();
		
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Entry Vehicle");
			System.out.println("2.Exit Vehicle");
			System.out.println("3.Display all vehicles");
			System.out.println("4.compute cost");
			
			System.out.println("0.exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter vehicleNumber");
				String vnum=sc.next();
				
				System.out.println("enter entry time");
				System.out.println("enter hour");
				int h=sc.nextInt();
				System.out.println("enter minute");
				int m=sc.nextInt();
				LocalTime entrytime=LocalTime.of(h, m);
				
				System.out.println("enter exit time");
				System.out.println("enter hour");
				int h2=sc.nextInt();
				System.out.println("enter minute");
				int m2=sc.nextInt();
				LocalTime exittime=LocalTime.of(h2, m2);
				
				System.out.println("enter slotno");
				int slotno=sc.nextInt();
				 System.out.println("Enter vehicle type");
				 String type=sc.next();
				 String car="car";
				 String bike="bike";
				 String cycle="cycle";
				 if(type.equalsIgnoreCase(car)) {
					 v[i]=new Car(vnum,entrytime,exittime,slotno,type);
					 i++;
					 p.vehicleEntry(vnum,type);
				 }
				 else if(type.equalsIgnoreCase(bike)) {
					 v[i]=new Bike(vnum,entrytime,exittime,slotno,type);
					 i++;
					 p.vehicleEntry(vnum,type);
				 }
				 else {
					 v[i]=new Cycle(vnum,entrytime,exittime,slotno,type);
					 i++;
				 }
				 break;
				 
				
				
			}
			case 2:{
				System.out.println("enter vehicle number");
				String vnum1=sc.next();
				for(Vehicle veh:v) {
					if(veh.getVehicleno()!=null) {
						if(veh.getVehicleno().equalsIgnoreCase(vnum1)) {
							p.vehicleExit(veh);
							veh.setVehicleno(null);
							veh.setEntryTime(null);
							veh.setExitTime(null);
							veh.setSlotno(0);
							veh.setType(null);
							break;
						}
					}
					else {
						continue;
					}
				}
				break;
			}
			case 3:{
				System.out.println("There are "+p.hset.size()+" vehicles in the parking lot");
				for(Vehicle veh:v) {
					if(veh!=null) {
						System.out.println("vehicle number :"+veh.getVehicleno()+" Entry time :"+veh.getEntryTime()+" Exit time :"+veh.getExitTime()+" slot number :"+veh.getSlotno()+" of type "+veh.getType());
					}
					
				}
				break;
				
			}
			case 4:{
				System.out.println("enter vehicle number");
				String vnum2=sc.next();
				for(Vehicle veh:v) {
					if(veh.getVehicleno()!=null) {
						if(veh.getVehicleno().equals(vnum2)) {
							float cost=p.computeCost(veh);
							System.out.println("the cost is "+cost);
							break;
						}
					}
					else {
						continue;
					}
				}
				break;
				
			}
			}				
		}
    while(ch!=0);
	}
}
