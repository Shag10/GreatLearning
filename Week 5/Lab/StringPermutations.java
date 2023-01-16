package Week5.Lab;

import java.util.*;

public class StringPermutations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");

        String s = sc.nextLine();
        printPermutations(s, 0, s.length()-1);
        sc.close();
	}
	
	public static void printPermutations(String s, int start, int end)
	{
		if(start >= end)
		{
			System.out.print(s+ " ");
			return;
		}
		for(int i=start; i<=end; i++)
		{
			s = swap(s, start, i);
			printPermutations(s, start+1, end);
			s = swap(s, start, i);
		}
	}
	public static String swap(String s, int start, int i)
	{
		char[] charArray = s.toCharArray();
		
		char temp = charArray[start];
		charArray[start] = charArray[i];
		charArray[i] = temp;
		
		return String.valueOf(charArray);
	}

}
