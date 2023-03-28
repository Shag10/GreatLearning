import java.util.*;
import java.util.ArrayList;

public class RedundantBrackets 
{
    public static boolean findRedundantBrackets(String s) 
    {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ')')
            {
                boolean operator = false;
                while(!st.isEmpty() && st.peek() != '(')
                {
                    char currTop = st.pop();
                    if(currTop == '*' || currTop == '+' || currTop == '-' || currTop == '/') operator = true;
                }

                if(!operator) return true;
                st.pop();
            }
            else st.push(s.charAt(i));
        }

        return false;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Answer: "+findRedundantBrackets(s));
    }
}
