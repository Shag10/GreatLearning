package Week3.PracticeAssignment;

import java.util.Scanner;

public class NestedTryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		try
		{
			System.out.println("Enter index to find element in Array: ");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			try
			{
				System.out.println("Enter number to divide Array with: ");
				int divNum = sc.nextInt();
				for(int i=0; i<n; i++) arr[i] = arr[i]/divNum;
				System.out.println("Array after division with "+divNum);
				for(int i=0; i<n ;i++) System.out.print(arr[i]+" ");		
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot divide array by zero\n"+e.getMessage()+" exception found");
			
			}
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Array index out of bounds\n"+e1.getMessage());
		}
		sc.close();
	}
}
