Class NthNodeFromLast
{
  public int getNthFromLast(Node head, int n)
  {
    Node slow = head;
    Node fast = head;
    
    while(fast != null) fast = fast.next;
    
    if(fast == null) return -1;
    
    while(fast.next != null)
    {
      fast = fast.next;
      slow = slow.next;
    }
    
  return slow.data;
  }
}
