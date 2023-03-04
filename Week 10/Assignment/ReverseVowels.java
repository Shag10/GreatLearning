import java.util.*;
class ReverseVowels{
    static String reverseVowels(String s) {
        if(s == null || s == "") return s;
        String vowel =  "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end)
        {
            while(start < end && !vowel.contains(chars[start]+""))
                start++;
            while(start < end && !vowel.contains(chars[end]+""))
                end--;

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
 
    // Driver Code
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      
        System.out.print(reverseVowels(s));
    }
}
