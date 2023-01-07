package Daily.Challenges.io;

import java.util.Scanner;

public class RotateArray {
	
	public static void reverse(int[] arr, int i, int j)
	{
		int l = i;
		int r = j;
		while(l < r)
		{
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	public static void rotateArray(int[] arr, int n, int k)
	{
		k = k%n;
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void rotateArraySimple(int[] arr, int n, int k)
	{
		k = k%n;
		for(int i=0; i<n; i++)
		{
			if(i < k)
			{
				System.out.print(arr[n+i-k]+ " ");
			}
			else
			{
				System.out.print(arr[i-k]+ " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Please select method you want to rotate your array with!\n1.Divide and Reversing Array\n2.Simple itrative conditional\n3.Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter size of Array");
				int n = sc.nextInt();
				int[] arr = new int[n];
				System.out.println("Enter elements in Array: ");
				for(int i=0; i<n; i++)
				{
					arr[i] = sc.nextInt();
				}
				System.out.println("Enter number of times you want to Rotate Array");
				int k = sc.nextInt();
				rotateArray(arr, n, k);
				break;
			case 2:
				System.out.println("Enter size of Array");
				int n1 = sc.nextInt();
				int[] arr1 = new int[n1];
				System.out.println("Enter elements in Array: ");
				for(int i=0; i<n1; i++)
				{
					arr1[i] = sc.nextInt();
				}
				System.out.println("Enter number of times you want to Rotate Array");
				int k1 = sc.nextInt();
				rotateArraySimple(arr1, n1, k1);
				break;
			case 3:
				System.out.println("Thanks you come again!!!!");
				break;
			default:
				System.out.println("Please enter valid choice");
				break;
			}
		}
		while(ch!=3);
		sc.close();
	}

}
