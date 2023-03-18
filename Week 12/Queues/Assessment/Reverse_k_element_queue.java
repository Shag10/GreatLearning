import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class Reverse_k_element_queue {
 
    static Queue<Integer> queue;

    static void reverseQueueFirstKElements(int k)
    {
       //write your code here
       if(k > queue.size() || k <= 0 || queue.isEmpty() == true) return;

       Stack<Integer> st = new Stack<>();
       for(int i=0; i<k; i++)
       {
           st.push(queue.peek());
           queue.remove();
       }
       while(!st.isEmpty())
       {
           queue.add(st.peek());
           st.pop();
       }

       for(int i=0; i<queue.size() - k; i++)
       {
           queue.add(queue.peek());
           queue.remove();
       }
       
    }
 
    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        queue = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int k=scan.nextInt();
       for (int i = 0; i < n; i++) {
           int x = scan.nextInt();
           queue.add(x);
       }

 
        reverseQueueFirstKElements(k);
        Print();
    }
}
