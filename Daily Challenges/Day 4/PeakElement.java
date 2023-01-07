package Daily.Challenges.io;

import java.util.Scanner;

public class PeakElement {
	
	public static int peakElement(int[] arr, int n)
	{
		// Time Complexity --> O(n)
		int max = 0;
		if(arr[0] >= arr[1])
			max=arr[0];
		for(int i=1; i<n-1; i++)
		{
			if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
			{
				if(arr[i] >= max)
					max = arr[i];
			}
		}
		if(arr[n-1] >= arr[n-2])
		{
			if(arr[n-1] >= max)
				max= arr[n-1];
		}
		return max;
	}
	
	public static int peakElementBetter(int[] arr, int n)
	{
        int start=0,end=n-1;
        int mid = 0;
        while(start<end)
        { 
                 mid= (start+end) >> 1;
                 if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>= arr[mid+1]))
                 { 
                           break;
                  }
                  else if(mid > 0 && arr[mid-1] > arr[mid])
                 { 
                        end = mid-1;
                 } 
                  else
                	  start = mid + 1;
        } 
        return arr[mid]; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Please select method you to find peak element with!\n1.Simple version\n2.Update better version\n3.Exit");
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
				System.out.println("Peak Element is: "+peakElement(arr, n));
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
				System.out.println("Peak Element is: "+peakElementBetter(arr1, n1));
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
