package Daily.Challenges.io;

class Node {
    int data;
    Node next;
 
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
public class MergeNodes {
 
    // Function to store numbers till 0
    static void inPlaceStore(Node head)
    {    
        if(head.data == 0){
           head = head.next;
        }
        
        // To store modified list
        Node res = head;
 
        // Traverse linked list and keep
        // adding nodes between 0s.
        Node temp = head;
        int sum = 0;
        while (temp != null) {
             
             
             
            // loop to sum the data of nodes till
            // it encounters 0
            if (temp.data != 0) {
                sum += temp.data;
                temp = temp.next;
            }
 
            // If we encounters 0, we need
            // to update next pointers
            else {
                res.data = sum;
                res.next = temp.next;
                temp = res.next;
                res = res.next;
                sum = 0;
            }
        }
        printList(head);
    }
 
    // Function to traverse and print Linked List
    static void printList(Node head)
    {
        while (head.next != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }
        System.out.println(head.data);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        Node head = new Node(3);
                head.next = new Node(2);
                head.next.next = new Node(0);
                head.next.next.next = new Node(4);
                head.next.next.next.next = new Node(5);
                head.next.next.next.next.next = new Node(0);
                head.next.next.next.next.next.next = new Node(6);
                head.next.next.next.next.next.next.next = new Node(7);
        inPlaceStore(head);
         
    }
}
