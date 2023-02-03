package Daily.Challenges.io;

import java.util.Scanner;

public class JumpGame {
	
	public static int jump(int[] arr, int n)
	{
		int ans = 0;
        int currFar=0, currEnd=0;
        for(int i=0; i<n-1; i++)
        {
            currFar = Math.max(currFar, i+arr[i]);
            if(i==currEnd)
            {
                ans++;
                currEnd = currFar;
            }
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
		System.out.println("Minimum jums required to reach end: "+jump(arr, n));
		sc.close();
	}

}
