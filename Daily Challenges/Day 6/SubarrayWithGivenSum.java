package Daily.Challenges.io;

import java.util.Scanner;

public class SubarrayWithGivenSum {
	
	//Time Complexity --> O(2n) ~~ O(n)
	//Space --> O(1)
	public static void subarrayWithGivenSum(int[] arr, int n, int sum)
	{
		int start = 0;
		int i;
		int currSum = arr[0];
		boolean flag = false;
		for(i=1; i<=n; i++)
		{
			while(currSum > sum && start < i-1)
			{
				currSum = currSum - arr[start];
				start++;
			}
			if(currSum == sum)
			{
				int pos = i-1;
				System.out.print("Sum found between indexes "+ start+" and " +pos);
				flag = true;
				break;
			}
			if(i < n)
			{
				currSum+= arr[i];
			}
		}
		if(!flag)
			System.out.print("There is no sum with "+sum+" sum");
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
		subarrayWithGivenSum(arr, n, sum);
		sc.close();
	}

}
