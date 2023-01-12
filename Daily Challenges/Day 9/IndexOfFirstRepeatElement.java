package Daily.Challenges.io;

import java.util.*;

public class IndexOfFirstRepeatElement {
	
	public static void indexOfFirstRepeatElement(int arr[], int n)
	{
		boolean flag = false;
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<n; i++)
		{
			if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1);
			else hm.put(arr[i], 1);
		}
		for(int i=0; i<n; i++)
		{
			if(hm.containsKey(arr[i]) && hm.get(arr[i]) > 1)
			{
				System.out.println(arr[i]+ " is the first element that repeats");
				flag = true;
				break;
			}
		}
		if(flag==false)
			System.out.println("No repeating elements found");
	}

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
		indexOfFirstRepeatElement(arr, n);
		sc.close();

	}

}
