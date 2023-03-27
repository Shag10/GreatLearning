package Daily.Challenges.io;

import java.util.*;

public class RemoveKDigits {
	
	public static String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i < num.length())
        {
            if(k > 0 && !st.isEmpty() && st.peek() > num.charAt(i))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }

        while(k > 0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        sb.reverse();

        while (sb.length() > 1 && sb.toString().startsWith("0"))  sb.deleteCharAt(0);

        return (sb.length() == 0) ? "0" : sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Enter number of digits to remove: ");
        int k = sc.nextInt();
        System.out.println("Smallest number after removing "+k+" digits is "+removeKdigits(s, k));
        sc.close();
	}

}
