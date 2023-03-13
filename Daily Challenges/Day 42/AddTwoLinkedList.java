package Daily.Challenges.io;

public class AddTwoLinkedList {
	
	public static Node addTwoNumbers(Node l1, Node l2) {
        Node r1 = reverseList(l1);
        Node r2 = reverseList(l2);
        // Step 2: Traverse the reversed linked lists and add the corresponding nodes
        int carry = 0;
        Node dummy = new Node(0);
        Node curr = dummy;

        while (r1 != null || r2 != null) 
        {
            int val1 = (r1 != null) ? r1.data : 0;
            int val2 = (r2 != null) ? r2.data : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (r1 != null) r1 = r1.next;
            if (r2 != null) r2 = r2.next;
        }

        if (carry > 0) 
        {
            curr.next = new Node(carry);
        }
        // Step 3: Reverse the output linked list and return the head
        return reverseList(dummy.next);
    }

    private static Node reverseList(Node head) 
    {
        Node prev = null;
        Node curr = head;
        while (curr != null) 
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
        Node l1 = new Node(7);
                l1.next = new Node(2);
                l1.next.next = new Node(4);
                l1.next.next.next = new Node(3);
        Node l2 = new Node(5);
                l2.next = new Node(6);
                l2.next.next = new Node(4);
        printList(l1);
        printList(l2);
        Node dum = new Node(0);
        dum.next = addTwoNumbers(l1, l2);
        System.out.println("After addition");
        printList(dum.next);
    }
}
