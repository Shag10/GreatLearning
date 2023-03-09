package Daily.Challenges.io;

import java.util.*;

public class NextGreaterNode {
	public static int[] nextLargerNodes(Node head) {
        int n = 0;
        Node curr = head;
        while(curr != null)
        {
            n++;
            curr = curr.next;
        }

        int[] nums = new int[n];
        curr = head;
        for(int i=0; i<n; i++)
        {
            nums[i] = curr.data;
            curr = curr.next;
        }

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++)
        {
            while(!st.isEmpty() && nums[i] > nums[st.peek()])
            {
                ans[st.pop()] = nums[i];
            }
            st.push(i);
        }
        return ans;
    }
 
    static void printList(Node head)
    {
        while (head.next != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }
        System.out.println(head.data);
    }
 
    public static void main(String[] args)
    {
        Node head = new Node(2);
                head.next = new Node(7);
                head.next.next = new Node(4);
                head.next.next.next = new Node(3);
                head.next.next.next.next = new Node(5);
        printList(head);
        int n = 0;
        Node curr = head;
        while(curr != null)
        {
            n++;
            curr = curr.next;
        }

        int[] ans = new int[n];
        ans = nextLargerNodes(head);
        for(int i=0; i<n; i++) System.out.print(ans[i]+ " ");
         
    }
}
