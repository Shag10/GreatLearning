package Daily.Challenges.io;

import java.util.Scanner;

public class ArithmeticSlices {
	
	public static int sliceArray(int[] arr, int n)
	{
		int ans=0;
		if(n < 3) return 0;
		int[] dp = new int[n];
		for(int i=2; i<n; i++)
		{
			dp[i] = dp[i-1]+1;
			ans += dp[i];
		}
		return ans;
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
		System.out.println("Number of Arithmetic Subarrays are: "+sliceArray(arr, n));
		sc.close();

	}

}
