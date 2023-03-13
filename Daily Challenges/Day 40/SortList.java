package Daily.Challenges.io;

public class SortList {
	
	public static Node sortList(Node head) {
        if(head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        //Traversing to find mid of linked list
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Breaking the list from mid and than sorting both the list explicitly
        Node mid = slow.next;
        slow.next = null;
        Node left = sortList(head);
        Node right = sortList(mid);

        //Merging both the breaked list
        Node dummy = new Node(0);
        Node curr = dummy;
        while(left != null && right != null)
        {
            if(left.data < right.data)
            {
                curr.next = left;
                left = left.next;
            }
            else
            {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if(left != null) curr.next = left;
        if(right != null) curr.next = right;

        return dummy.next;

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
        Node head = new Node(4);
                head.next = new Node(2);
                head.next.next = new Node(1);
                head.next.next.next = new Node(3);
        printList(head);
        Node dum = new Node(0);
        dum.next = sortList(head);
        printList(dum.next);
    }
}
