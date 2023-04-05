class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class Index {
  int postindex = 0;
}

class ConstructBST{
  Node constructTreeUtil(int post[], Index postIndex,
    int key, int min, int max, int size) {
    if (postIndex.postindex < 0)
      return null;

    Node root = null;

    if (key > min && key < max) {
      root = new Node(key);
      postIndex.postindex = postIndex.postindex - 1;

      if (postIndex.postindex >= 0) {
        root.right = constructTreeUtil(post, postIndex,
          post[postIndex.postindex], key, max, size);
        root.left = constructTreeUtil(post, postIndex,
          post[postIndex.postindex], min, key, size);
      }
    }
    return root;
  }

  Node constructTree(int post[], int size) {
    Index index = new Index();
    index.postindex = size - 1;
    return constructTreeUtil(post, index, post[index.postindex],
      Integer.MIN_VALUE, Integer.MAX_VALUE, size);
  }

  void inorder(Node node) {
    if (node == null)
      return;
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }

  public static void main(String[] args) {
    ConstructBST tree = new ConstructBST();
    int post[] = new int[] {1, 5, 10, 60, 45, 20};
    int size = post.length;

    Node root = tree.constructTree(post, size);
    tree.inorder(root);
  }
}


