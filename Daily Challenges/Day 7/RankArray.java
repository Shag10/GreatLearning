package Daily.Challenges.io;

import java.util.*;

public class RankArray {
	
	public static void rankArray(int[] arr, int n)
	{
		int[] newArr = Arrays.copyOfRange(arr, 0, n);
		Arrays.sort(newArr);
		
		Map<Integer, Integer> ranks = new HashMap<>();
		int rank = 1;
		for(int i=0; i< n; i++)
		{
			if(ranks.get(newArr[i]) == null)
			{
				ranks.put(newArr[i], rank);
				rank++;
			}
		}
		for(int i=0; i< n; i++)
			arr[i] = ranks.get(arr[i]);
		
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
		rankArray(arr, n);
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		sc.close();

	}

}
