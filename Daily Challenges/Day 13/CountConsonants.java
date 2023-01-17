package Daily.Challenges.io;

import java.util.*;

public class CountConsonants {
	
	public static boolean isConsonant(char ch)
	{
		ch = Character.toUpperCase(ch);
		
		return !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && ch >=65 && ch<=90;
		
	}
	public static int countConsonantsIterative(String s)
	{
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(isConsonant(s.charAt(i)))
				count++;
		}
		return count;
	}
	
	public static int countConsonantsRecursive(String s, int n)
	{
		if(n == 1)
		{
			if(isConsonant(s.charAt(0)))
				return 1;
			else
				return 0;
		}
		if(isConsonant(s.charAt(n-1))) return countConsonantsRecursive(s, n-1) + 1;
		else return countConsonantsRecursive(s, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Please enter type of operation you want to perform\n1. Itrative\n2. Recursive\n3. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter String");
				String s = sc.nextLine();
				System.out.println("Answer: "+countConsonantsIterative(s));
				break;
			case 2:
				System.out.println("Enter String");
				String s1 = sc.nextLine();
				System.out.println("Answer: "+countConsonantsRecursive(s1, s1.length()-1));
				break;
			case 3:
				System.out.println("Thanks for using my consonant count System");
				break;
			default:
				System.out.println("Please enter valid input(1,2,3)");
				break;
			}
		}
		while(choice != 3);		
		sc.close();
		
	}

}
