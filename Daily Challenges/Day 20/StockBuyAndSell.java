package Daily.Challenges.io;

import java.util.Scanner;

public class StockBuyAndSell {
	
	public static int maximunProfit(int[] arr, int n)
	{
		//Time --> O(n)
		//Space --> O(1)
		int max_profit = 0;
		for(int i=1; i<n; i++)
		{
			if(arr[i] > arr[i-1]) max_profit += arr[i] - arr[i-1];
		}
		return max_profit;
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
		System.out.println("Maximun Profit is "+maximunProfit(arr, n));
		sc.close();

	}

}
