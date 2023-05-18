class LongestZigZagPathinaBinaryTree {
    int maxStep = 0;
    public int longestZigZag(TreeNode root) {
        
        if(root.left != null) findZigZag(root.left, 1, false, true);
        if(root.right != null) findZigZag(root.right, 1, true, false);
        return maxStep;
    }

    public void findZigZag(TreeNode root, int step, boolean goLeft, boolean goRight)
    {
        maxStep = Math.max(maxStep, step);

        if(goLeft)
        {
            if(root.left != null) findZigZag(root.left, step+1, false, true);
            if(root.right != null) findZigZag(root.right, 1, true, false);
        }
        if(goRight)
        {
            if(root.right != null) findZigZag(root.right, step+1, true, false);
            if(root.left != null) findZigZag(root.left, 1, false, true);
        }
    }
}
