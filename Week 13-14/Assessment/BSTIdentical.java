import java.util.*;

class BSTIdentical {

  static class Node {
    int data;
    Node left;
    Node right;
  };

  static Node newNode(int val) {
    Node temp = new Node();
    temp.data = val;
    temp.left = temp.right = null;
    return temp;
  }
  static void insertToHash(Node root, HashSet < Integer > s) {
    if (root == null)
      return;
    insertToHash(root.left, s);
    s.add(root.data);
    insertToHash(root.right, s);
  }

  static boolean checkBSTs(Node root1, Node root2) {
    // Base cases
    if (root1 != null && root2 != null)
      return true;
    if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
      return false;

    HashSet < Integer > s1 = new HashSet < Integer > ();
    HashSet < Integer > s2 = new HashSet < Integer > ();
    insertToHash(root1, s1);
    insertToHash(root2, s2);

    return (s1.equals(s2));
  }

  public static void main(String[] args) {
    // First BST
    Node root1 = newNode(15);
    root1.left = newNode(10);
    root1.right = newNode(20);
    root1.left.left = newNode(5);
    root1.left.right = newNode(12);
    root1.right.right = newNode(25);

    // Second BST
    Node root2 = newNode(15);
    root2.left = newNode(12);
    root2.right = newNode(20);
    root2.left.left = newNode(5);
    root2.left.left.right = newNode(10);
    root2.right.right = newNode(25);

    // check if two BSTs have same set of elements
    if (checkBSTs(root1, root2))
      System.out.print("YES");
    else
      System.out.print("NO");
  }
}

