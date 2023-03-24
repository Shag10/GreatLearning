package Daily.Challenges.io;

import java.util.Scanner;

public class DecodeWays {
	
	public static int decodedWaysRecursive(String s)
	{
		return dWays(0, s);
	}
	
	public static int dWays(int i, String s)
	{
		if(i >= s.length()) return 1;
		else if(s.charAt(i) == '0') return 0;
		else if(i == s.length() - 1) return 1;
		else if(s.charAt(i) == '1' || s.charAt(i) == '2' && (s.charAt(i+1) >= 48 && s.charAt(i+1) <= 54 )) return dWays(i+1, s) + dWays(i+2, s);
		else return dWays(i+1,s);
	}
	
	public static int decodedWaysDP(String s)
	{
		if(s.length() == 0 || s.charAt(0) == '0') return 0;
		int[] dp = new int[s.length()+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2; i<=s.length(); i++)
		{
			if(s.charAt(i-1) >= '1' && s.charAt(i-1) <= '9') dp[i] = dp[i-1];
			if(s.charAt(i-2) == '1') dp[i] += dp[i-2];
			else if(s.charAt(i-2) == '2' && (s.charAt(i-1) >= '0' && s.charAt(i-1) <= '6')) dp[i] += dp[i-2];		
		}
		return dp[dp.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		System.out.println("Output: "+decodedWaysRecursive(s));
		System.out.println("Output: "+decodedWaysDP(s));
		sc.close();
	}

}
