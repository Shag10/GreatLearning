package Daily.Challenges.io;

import java.util.Scanner;

public class LengthOfLongestSubstring {
	
	public static int lengthOfLongestSubstring(String s)
	{
		String test = "";
        int maxLength = -1;
 
        if (s.isEmpty()) {
            return 0;
        }
        else if (s.length() == 1) {
            return 1;
        }
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);

            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                                      + 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }
 
        return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Length of Longest Substring is: "+lengthOfLongestSubstring(s));
		sc.close();
	}

}
