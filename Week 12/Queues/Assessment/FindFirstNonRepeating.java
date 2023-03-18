import java.util.*;
public class FindFirstNonRepeating {
  final static int MAX_CHAR = 26;

  static void firstNonRepeating(String str) {
    //write your code here
    // also print the output
    int[] charCount = new int[MAX_CHAR];
    Queue < Character > q = new LinkedList < Character > ();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      q.add(ch);
      charCount[ch - 'a']++;
      while (!q.isEmpty()) {
        if (charCount[q.peek() - 'a'] > 1)
          q.remove();
        else {
          System.out.print(q.peek() + " ");
          break;
        }
      }
      if (q.isEmpty())
        System.out.print(-1 + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

    firstNonRepeating(str);
  }
}
