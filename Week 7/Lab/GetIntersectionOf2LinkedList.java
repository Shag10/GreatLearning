/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class GetIntersectionOf2LinkedList {
    public ListNode helper(ListNode headA, int c1, ListNode headB, int c2)
    {
        int diff = c1 - c2;
        while(diff > 0)
        {
            headA = headA.next;
            diff--;
        }
        while(headA != null)
        {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int c1 = 1;
        int c2 = 1;
        ListNode temp = headA;
        while(temp.next != null)
        {
            temp = temp.next;
            c1++;
        }
        temp = headB;
        while(temp.next != null)
        {
            temp = temp.next;
            c2++;
        }

        if(c1 > c2)
            return helper(headA, c1, headB, c2);
        else
            return helper(headB, c2, headA, c1);
    }
}
