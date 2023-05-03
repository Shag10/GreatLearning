import java.util.*;

class MinimumSeconds {
  public static void main(String[] args) {
    int[] amount = {1,4,2};
    System.out.println(fillCups(amount));

  }

  static public int fillCups(int[] amount) {
    PriorityQueue < Integer > pQ = new PriorityQueue < > ((a, b) -> b - a);
    pQ.add(amount[0]);
    pQ.add(amount[1]);
    pQ.add(amount[2]);
    int seconds = 0;
    while (pQ.peek() != 0) {
      seconds++;
      int high1 = pQ.poll() - 1;
      int high2 = pQ.poll() - 1;

      pQ.add(high1 > 0 ? high1 : 0);
      pQ.add(high2 > 0 ? high2 : 0);
    }

    return seconds;
  }

}