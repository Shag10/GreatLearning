import java.util.*;

public class LongestCommonPrefix
{
	static String longestCommonPrefix(String[] a)
	{
		int len = a.length;
		if(len == 0) return "";
		if(len == 1) return a[0];
		Arrays.sort(a);
		int end = Math.min(a[0].length(), a[len-1].length());
		int i = 0;
		while(i < end && a[0].charAt(i) == a[len-1].charAt(i)) i++;
		String pre = a[0].substring(0, i);

		return pre;
	}

	/* Driver Function to test other function */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  String[] s=new String[n];
	  for(int i=0;i<n;i++)
	  s[i]=sc.next();
	  System.out.println(longestCommonPrefix(s));
	}
}
