package Week5.Lab;

import java.util.Scanner;

public class PowerOfNumber {
	
	public static long powerOfNumber(long num, long pow)
	{
		int Modulo = 1000000007; 
		
		if(num == 0) return 0;
		if(pow == 0) return 1;
		
		return (num%Modulo*(powerOfNumber(num, pow - 1)%Modulo))%Modulo;
		
	}
	public static long powerOfNumberOptimized(long num, long pow)
	{
		int Modulo = 1000000007; 
		
		if(num == 0) return 0;
		if(pow == 0) return 1;
		
		if(pow%2 == 0)
		{
			long temp = powerOfNumberOptimized(num, pow/2)%Modulo;
			return (temp*temp)%Modulo;
		}
		else
		{
			long temp = num%Modulo;
			return (temp*powerOfNumberOptimized(num, pow-1)%Modulo)%Modulo;
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		long num = sc.nextInt();
		System.out.println("Enter power:");
		long pow = sc.nextInt();
		//System.out.println("Result: "+ powerOfNumber(num, pow));
		System.out.println("Result: "+ powerOfNumberOptimized(num, pow));
		sc.close();
	}
}
