import java.util.*;

class RemoveCharacterforStar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    String s = scan.nextLine();    
    System.out.println(removeStars(s));
  }

   public static String removeStars(String s) {
        //write your code here
        if(s.equals("") || s.equals("*")) return s;
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
          if(!st.isEmpty() && ch == '*') st.pop();
          else st.push(ch);
        }
        for(char c: st)
        {
          if(!st.isEmpty()) ans += c;
        }

        return ans;
    }

}
