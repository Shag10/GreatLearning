package Daily.Challenges.io;

import java.util.*;

public class AllPiarsWithTargetSum {
	
	public static void allPairs(int[] arr, int n, int sum)
	{
		Arrays.sort(arr);
		int i = 0;
		int j = n-1;
		boolean flag = false;
		while(i < j)
		{
			if(arr[i]+arr[j] == sum)
			{
				System.out.println("Elements which form the sum are: "+arr[i]+","+arr[j]);
				flag = true;
				i++;
				j--;
			}
			else if(arr[i] + arr[j] > sum)
				j--;
			else if(arr[i] + arr[j] < sum)
				i++;
		}
		if(flag == false)
		{
			System.out.println("No pairs found with sum: "+sum);
		}
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
		System.out.println("Enter the target sum");
		int sum = sc.nextInt();
		allPairs(arr, n, sum);
		sc.close();
	}

}
