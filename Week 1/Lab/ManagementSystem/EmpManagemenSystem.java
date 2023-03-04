package ManagementSystem.pojos;
import java.util.Scanner;

public class EmpManagemenSystem {
	public static void main(String args[]) {
		Manager manag = new Manager(1, "Mang1", "Dept1", 4);
		TeamMate tm1 = new TeamMate(123, 1, "XYZ", "Dept1", 'M');
		//TeamMate tm2 = new TeamMate(124, 1, "XeZ", "Dept1", 'F');
		
		TeamMate[] teammate = new TeamMate[5];
		if(manag.getId() == tm1.getManagerId())
		{
			for(int i=0; i<teammate.length; i++)
			{
				teammate[i] = tm1; 
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Please choose from following options\n1.Manager Details\n2.Employee Details\n3.Finish");
			int options = sc.nextInt();
			switch(options)
			{
			case 1:
				System.out.println("Please enter manager id: ");
				int mngid = sc.nextInt();
				if(manag.getId() == mngid ) 
				{
					System.out.println(manag.toString());
					for(int i=0; i<teammate.length; i++)
					{
						if(teammate[i].getManagerId() == mngid)
						{
							System.out.println(tm1.toString());
						}
					}
				}
			case 2:
				System.out.println("Please enter employee id: ");
				int empid = sc.nextInt();
				if(tm1.getEmpId() == empid ) 
				{
					System.out.println(tm1.toString());
				}
			case 3:
				break;
			default:
				System.out.println("Please select options available");
			}
			sc.close();
		}
	}
}
