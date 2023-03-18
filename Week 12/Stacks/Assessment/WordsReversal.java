import java.util.*;

class WordsReversal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    String s = scan.nextLine();    

    System.out.println(reverseWordsofSentence(s));
  }

  public static String reverseWordsofSentence(String s) {
   //write your code here
   Stack<String> st = new Stack<>();
   //String[] ans = s.split(" ", 0);
   String res = "";
   String temp = "";
   for(int i=0; i<s.length(); i++)
   {
     if(s.charAt(i) == ' ')
     {
       st.push(temp);
       temp = "";
     }
     else temp += s.charAt(i);
   }
   st.push(temp);
   while(!st.isEmpty())
   {
      temp = st.peek();
      res += temp + " ";
      st.pop();
   }
   return res.trim();
  }
}
