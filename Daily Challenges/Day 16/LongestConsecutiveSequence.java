package Daily.Challenges.io;

import java.util.*;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutiveSequence(int[] arr, int n)
	{
        Arrays.sort(arr);
        if(n == 0) return 0;
		int count = 1, maxCount = 1;
		int i = 0, j = i+1;
		while(j < n)
		{
			if(arr[j] == arr[i] + 1)
			{	
				count++;
				if(count >= maxCount) maxCount = count;
				i++;
				j++;
			}
			else if(arr[i] == arr[j])
			{
				i++;
				j++;
			}
			else
			{
				count = 1;
				i++;
				j++;
			}
		}
		return maxCount;
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
		
		System.out.println("Length Longest Consecutive Sequence is: "+longestConsecutiveSequence(arr, n));
		sc.close();
		
	}
}
