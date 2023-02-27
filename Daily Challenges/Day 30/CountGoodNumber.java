package Daily.Challenges.io;

import java.util.*;

public class CountGoodNumber {
	
	static long mod = 1000000007;
	public static int goodNumber(long n)
	{
		long odd = n/2;
		long even = (n+1)/2;		
		return (int)(pow(5, even)*pow(4, odd)%mod);
	}
	
	public static long pow(long x, long n)
	{
		if(n==0) return 1;
		long temp = pow(x, n/2);
		if(n%2 == 0) return (temp*temp)%mod;
		else return (x*temp*temp)%mod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long n = sc.nextInt();
		System.out.println("Result is: "+goodNumber(n));
		//System.out.println("Result is: "+lastRemainingBetter(n));
		sc.close();

	}

}
