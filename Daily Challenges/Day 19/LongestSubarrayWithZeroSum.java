package Daily.Challenges.io;

import java.util.*;

public class LongestSubarrayWithZeroSum {

	public static int longestSubarrayWithZeroSum(int[] arr, int n)
	{
		//Time --> O(nlogn)
		//Space --> O(1)
		
		Arrays.sort(arr);
		int start = 0, end = n-1;
		int count = n, sum =0;
		boolean flag = false;
		for(int i=0; i<n; i++) sum+= arr[i];
		while(start <= end)
		{
			if(sum < 0)
			{
				sum -= arr[start];
				count--;
				start++;
			}
			else if(sum > 0)
			{
				sum -= arr[end];
				count--;
				end--;
			}
			else
			{
				flag = true;
				break;
			}
		}
		if(flag) return count;
		else return -1;
	}
	
	public static int longestSubarrayWithZeroSumOptimized(int[] arr, int n)
	{
		//Time --> O(n)
		//Space --> O(n)
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

	    int sum = 0;
	    int max_len = 0;
	
	    for (int i = 0; i < n; i++) {
	        sum += arr[i];
	
	        if (sum == 0)
	            max_len = i + 1;
	
	        Integer prev_i = hM.get(sum);
	        if (prev_i != null)
	            max_len = Math.max(max_len, i - prev_i);
	        else
	            hM.put(sum, i);
	    }	
	    return max_len;
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
		int ans = longestSubarrayWithZeroSum(arr, n);
		if(ans != -1) System.out.println("Longest Subarray With Zero Sum is "+longestSubarrayWithZeroSum(arr, n));
		else System.out.println("No subarray found with zero sum");
		
		System.out.println("Longest Subarray With Zero Sum is "+longestSubarrayWithZeroSumOptimized(arr, n));
		sc.close();
	}
}
