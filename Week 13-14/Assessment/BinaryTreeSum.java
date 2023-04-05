class Node {
  int data;
  Node left, right, nextRight;

  Node(int item) {
    data = item;
    left = right = null;
  }
}
class BinaryTreeSum {
  public static Node root;

  static int sum(Node node) {
    if (node == null) {
      return 0;
    }
    return (sum(node.left) + node.data + sum(node.right));
  }

  static int isSumTree(Node node) {
    int ls, rs;
    if (node == null || (node.left == null && node.right == null)) {
      return 1;
    }

    ls = sum(node.left);
    rs = sum(node.right);

    if ((node.data == ls + rs) && isSumTree(node.left) != 0 && isSumTree(node.right) != 0) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    BinaryTreeSum tree = new BinaryTreeSum();
    tree.root = new Node(26);
    tree.root.left = new Node(10);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(6);
    tree.root.right.right = new Node(3);
    if (isSumTree(root) != 0) {
      System.out.println("Given tree follows the property");
    } else {
      System.out.println("Given tree doesnot follow the property");
    }
  }
}

