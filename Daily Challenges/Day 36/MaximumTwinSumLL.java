package Daily.Challenges.io;


public class MaximumTwinSumLL {
 
    // Function to store numbers till 0
	public static int pairSum(Node head) {
        Node head1 = null;
        Node temp = head;
        int count = 0;

        while(temp != null)
        {
            count++;
            Node node = new Node(temp.data);
            if(head1 == null)
            {
                head1 = node;
            }
            else
            {
                node.next = head1;
                head1 = node;
            }
            temp = temp.next;
        }
        int max = 0;
        for(int i=0; i<count/2; i++)
        {
            while(head != null && head1 != null)
            {
                if(head.data+head1.data > max)
                {
                    max = head.data+head1.data;
                }

                head = head.next;
                head1 = head1.next;
            }
        }
        return max;
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
        Node head = new Node(5);
                head.next = new Node(4);
                head.next.next = new Node(2);
                head.next.next.next = new Node(1);
        System.out.println(pairSum(head));
         
    }
}
