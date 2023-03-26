package Daily.Challenges.io;

import java.util.Scanner;

public class DecodedStringatIndex {
	
	public static String decodeStringatIndex(String s, int k)
	{
		long size = 0;
        int n = s.length();
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c)) size *= (int)(c-'0');
            else size++;
        }

        //System.out.println(size);
        char c = '\0';
        for(int i = n-1; i>=0 ;i--)
        {
            c = s.charAt(i);
            k %= size;
            if((k == 0 || k == size) && Character.isLetter(c)) return Character.toString(c);
            else if(Character.isDigit(c)) size /= c - '0';
            else size--;
        }

        return Character.toString(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Enter index to be searched: ");
        int k = sc.nextInt();
        System.out.println("Letter at index "+k+" after decode is: '"+decodeStringatIndex(s, k)+"'");
        sc.close();
	}

}
