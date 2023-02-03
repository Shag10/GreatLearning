package Daily.Challenges.io;

import java.util.*;

public class DecodeString {
	
	static int i=0;
	public static String decodedString(String s)
	{
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while (i < s.length())
		{
			char c = s.charAt(i);
			i++;
			if (Character.isLetter(c))
			{
				sb.append(c);
			}
	
			else if (Character.isDigit(c))
			{
				count = count * 10 + Character.getNumericValue(c);
			}
	
			else if (c == ']') {
				break;
			}
			
			else if (c == '[')
			{
				String repeat = decodedString(s);
				while (count > 0)
				{
					sb.append(repeat);
					count--;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		System.out.println("Output: "+decodedString(s));
		sc.close();

	}

}
