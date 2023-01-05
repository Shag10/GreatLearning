package Daily.Challenges.io;

import java.util.*;

public class SearchPosition {
	//Normal search 
  //Time complexity O(n)
	public static void normalSearch(int[] arr, int n, int target)
	{
		int i=0;
		while(i<n)
		{
			if(arr[i] == target)
			{
				System.out.println("Element "+target+" found at position "+i);
				break;
			}
			else if(arr[i] > target)
			{
				System.out.println("Element not found but if inserted should be inserted at position "+i);
				break;
			}
			else if(i == n-1 && target > arr[i])
			{
				System.out.println("Element not found but if inserted at the end of array , here position "+(i+1));
			}
			i++;
		}
		System.out.println();
	}
  
  //Binary search 
  //Time complexity O(log(n))
	public static int binarySearch(int[] arr, int n, int target)
	{
		int pos = 0, l = 0, h = arr.length - 1;
	    while (l <= h) {
	        int mid = l + (h - l) / 2;

	        if (target > arr[mid]) {
	            l = mid + 1;
	            pos = mid + 1;
	        } else if (target < arr[mid]) {
	            h = mid - 1;
	            pos = mid;
	        } else {
	            pos = mid;
	            break;
	        }
	    }
	    return pos;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Please enter type of search you want to perform\n1. Normal Search\n2. Binary Search\n3. Exit");
			System.out.println("NOTE : For this system, please make sure you adding elements in sorted order(Ascending)");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter size of Array");
				int n = sc.nextInt();
				int[] arr = new int[n];
				System.out.println("Enter elements in Array");
				for(int i=0; i<n; i++)
				{
					arr[i] = sc.nextInt();
				}
				System.out.println("Enter element you want to search");
				int target= sc.nextInt();
				normalSearch(arr, n, target);
				break;
			case 2:
				System.out.println("Enter size of Array");
				int n1 = sc.nextInt();
				int[] arr1 = new int[n1];
				System.out.println("Enter elements in Array");
				for(int i=0; i<n1; i++)
				{
					arr1[i] = sc.nextInt();
				}
				System.out.println("Enter element you want to search");
				int target1 = sc.nextInt();
				System.out.println("Position " +binarySearch(arr1, n1, target1));
				break;
			case 3:
				System.out.println("Thanks for using my Search System");
				break;
			default:
				System.out.println("Please enter valid input(1,2,3)");
				break;
			}
		}
		while(ch!=3);
		sc.close();
	}

}
