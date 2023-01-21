package Daily.Challenges.io;

import java.util.*;

public class KthPermutation {
	
	public static void swap(char s[], int i, int j) 
	{
		char ch = s[i];
		s[i] = s[j];
		s[j] = ch;
	}

	public static void permutationHelper(char s[], int index, ArrayList < String > res) 
	{
		if (index == s.length) 
		{
			String str = new String(s);
			res.add(str);
			return;
		}
		for (int i = index; i < s.length; i++) 
		{
			swap(s, i, index);
			permutationHelper(s, index + 1, res);
			swap(s, i, index);
		}
	}
		
	public static String getPermutation(int n, int k) 
	{
		String s = "";
		ArrayList < String > res = new ArrayList < > ();
		for (int i = 1; i <= n; i++) 
		{
			s += i;
		}
		permutationHelper(s.toCharArray(), 0, res);
		Collections.sort(res);
		return res.get(k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the value of k (Index)");
		int k = sc.nextInt();
		System.out.println("Permutation at kth index is: "+getPermutation(n, k));
		sc.close();
	}

}
