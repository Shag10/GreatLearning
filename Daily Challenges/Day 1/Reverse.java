import java.util.Scanner;

public class Reverse {
	
	public static void reverseArray(int[] arr, int n)
	{
		for(int i=n-1; i>-1; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void stringReverse(String s)
	{
		char[] str = s.toCharArray();
		for(int i=str.length-1; i>-1; i--)
		{
			System.out.print(str[i]+"");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Please choose from below options\n1. Reverse the integer array\n2. Reverse the string\n3. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter number of elements to reverse");
				int n = sc.nextInt();
				int[] arr = new int[n];
				System.out.println("Enter elements into array");
				for(int i=0; i<n; i++)
				{
					arr[i] = sc.nextInt();
				}
				reverseArray(arr, n);
				System.out.println();
				break;
			
			case 2:
				System.out.println("Enter string to reverse");
				String s = sc.next();
				stringReverse(s);
				System.out.println();
				break;
			
			case 3:
				System.out.println("Thanks for using my Reverse System");
				break;
			default:
				System.out.println("Please choose valid choices");
				System.out.println();
				break;
			}
			
		}
		while(choice!=3);
		sc.close();
	}

}
