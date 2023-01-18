package Daily.Challenges.io;

import java.util.*;

public class EvenLengthBinarySequences {
	
	public static void evenLengthBinarySequences(int diff, char ans[], int start, int end)
	{
		if (Math.abs(diff) > (end - start + 1) / 2)
			return;
		if (start > end)
		{
			if (diff == 0)
			{
				System.out.print(ans);
				System.out.print(" ");
			}
			return;
		}
		ans[start] = '0';
		ans[end] = '1';
		evenLengthBinarySequences(diff + 1, ans, start + 1, end - 1);
		ans[start] = ans[end] = '1';
		evenLengthBinarySequences(diff, ans, start + 1, end - 1);
		ans[start] = ans[end] = '0';
		evenLengthBinarySequences(diff, ans, start + 1, end - 1);
		ans[start] = '1';
		ans[end] = '0';
		evenLengthBinarySequences(diff - 1, ans, start + 1, end - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		char[] ans = new char[2*n+1]; 
		ans[2*n] = '\0';
		evenLengthBinarySequences(0, ans, 0, 2*n -1);
		sc.close();
	}

}
