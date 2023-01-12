package Daily.Challenges.io;

import java.util.*;

public class MinimumSwaps {
	
	public static int minSwaps(int[] arr, int n)
	{
		int count=0;
		int[] temp = Arrays.copyOfRange(arr, 0, n);
		Map<Integer, Integer> hm = new HashMap<>();
		Arrays.sort(temp);
		for(int i=0; i<n; i++)
		{
			hm.put(arr[i], i);
		}
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] != temp[i])
			{
				count++;
				swap(arr, i, hm.get(temp[i]));
				
				hm.put(arr[i], hm.get(temp[i]));
				hm.put(temp[i], i);
			}
		}
		return count;
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
		System.out.println("Minimum Swaps required to sort the array is: "+minSwaps(arr, n));
		sc.close();
	}

}
