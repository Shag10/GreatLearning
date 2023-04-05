class CloneLinkedList{
  static class Node {
    int data;
    Node next, random;


    Node(int data) {
      this.data = data;
    }
  }

  public static void traverse(Node head) {

    while (head != null) {

      if (head.random != null) {
        System.out.print(head.data + "(" + head.random.data + ") —> ");
      } else {
        System.out.print(head.data + "(" + "X" + ") —> ");
      }

      // advance to the next node
      head = head.next;
    }

    System.out.println("null");
  }


  public static Node cloneLinkedList(Node head) {
    Node curr = head;
    while (curr != null) {
      Node next = curr.next;
      Node dup = new Node(curr.data);
      curr.next = dup;
      dup.next = next;
      curr = next;
    }
    curr = head;
    while (curr != null) {
      if (curr.random != null) {
        (curr.next).random = (curr.random).next;
      }

      curr = (curr.next).next;
    }
    Node dummy = new Node(-1);
    Node tail = dummy;
    curr = head;
    while (curr != null) {
      Node next = curr.next.next;
      Node dup = curr.next;
      tail.next = dup;
      tail = dup;
      curr.next = next;
      curr = next;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    head.random = head.next.next.next;
    head.next.next.random = head.next;

    System.out.print("Original linked list:\n");
    traverse(head);

    Node clone = cloneLinkedList(head);

    System.out.print("\nCloned linked list:\n");
    traverse(clone);
  }
}

