import java.util.*;
 
class LongestUniqueSubsttr {
    public static int longestUniqueSubsttr(String s)
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
 
    // Driver code
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       System.out.println(longestUniqueSubsttr(s));
    }
}
