package Week3.PracticeAssignment;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		String s = null;
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int divider = 0;
		try
		{
			System.out.println(arr[n+1]);
			for(int i=0; i<n; i++) arr[i] = arr[i]/divider;
			char[] s1 = s.toCharArray();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide array by zero\n"+e.getMessage()+" exception found");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Array index out of bounds\n"+e1.getMessage());
		}
		catch(Exception e2)
		{
			System.out.println("Some exception has occurred\n"+e2.getMessage());
		}
		sc.close();
	}

}
