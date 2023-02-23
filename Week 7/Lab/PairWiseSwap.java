/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PairWiseSwap {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        head = head.next;

        while(curr != null && curr.next != null)
        {
            if(prev != null) prev.next = curr.next;
            ListNode temp = curr.next.next;
            curr.next.next = curr;
            curr.next = temp;

            prev = curr;
            curr = temp;
        }

        return head;
    }
}
