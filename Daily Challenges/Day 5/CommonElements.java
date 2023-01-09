package Daily.Challenges.io;

import java.util.*;

public class CommonElements {
	
	public static void commonElements(int[] arr1, int[] arr2, int[] arr3, int n1, int n2, int n3)
	{
		int i = 0; int j=0; int k=0;
		while(i<n1 && j<n2 && k<n3)
		{
			if(arr2[j] == arr1[i] && arr1[i] == arr3[k])
			{
				System.out.print(arr1[i]+" ");
				j++;
				i++;
				k++;
			}
			else if(arr1[i] < arr2[j]) 
			{ 
				i++;
			}
			else if(arr3[k] > arr2[j])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array1: ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter elements in Array1: ");
		for(int i=0; i<n1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size of Array2: ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter elements in Array2: ");
		for(int i=0; i<n2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("Enter size of Array3: ");
		int n3 = sc.nextInt();
		int[] arr3 = new int[n3];
		System.out.println("Enter elements in Array3: ");
		for(int i=0; i<n3; i++)
		{
			arr3[i] = sc.nextInt();
		}
		commonElements(arr1, arr2, arr3, n1, n2, n3);
		sc.close();
	}

}
