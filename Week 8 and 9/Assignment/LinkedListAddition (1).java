/*
 
1. Modify the list by adding preceeding zeroes by traversing both linked list incase they are unequal.
2. Start doing elementary addition
3. Add two digits and maintain carry for next addition recursively


TC: O(m + n)
SC: O(m + n)
 */

class LinkedListAddition{

  static Node head1, head2;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  void addTwolsts(Node first, Node second) {
    Node start1 = new Node(0);
    start1.next = first;
    Node start2 = new Node(0);
    start2.next = second;

    addPrecedingZeros(start1, start2);
    Node result = new Node(0);
    if (sumTwoNodes(start1.next, start2.next, result) == 1) {
      Node node = new Node(1);
      node.next = result.next;
      result.next = node;
    }
    printlst(result.next);
  }


  private int sumTwoNodes(Node first, Node second, Node result) {
    if (first == null) {
      return 0;
    }
    int number = first.data + second.data + sumTwoNodes(first.next, second.next, result);
    Node node = new Node(number % 10);
    node.next = result.next;
    result.next = node;
    return number / 10;
  }


  private void addPrecedingZeros(Node start1, Node start2) {
    Node next1 = start1.next;
    Node next2 = start2.next;
    while (next1 != null && next2 != null) {
      next1 = next1.next;
      next2 = next2.next;
    }
    if (next1 == null && next2 != null) {
      while (next2 != null) {
        Node node = new Node(0);
        node.next = start1.next;
        start1.next = node;
        next2 = next2.next;
      }
    } else if (next2 == null && next1 != null) {
      while (next1 != null) {
        Node node = new Node(0);
        node.next = start2.next;
        start2.next = node;
        next1 = next1.next;
      }
    }
  }


  void printlst(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    Test lst = new Test();


    lst.head1 = new Node(1);
    lst.head1.next = new Node(2);
    lst.head1.next.next = new Node(8);


    lst.head2 = new Node(9);
    lst.head2.next = new Node(9);
    lst.head2.next.next = new Node(7);

    lst.addTwolsts(head1, head2);
  }

}
