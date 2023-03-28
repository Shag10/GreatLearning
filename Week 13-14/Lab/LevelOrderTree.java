class LevelOrderTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> levelNode = new ArrayList<>();
            for(int i=0; i<size; i++)
            {
                TreeNode node = q.remove();
                levelNode.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            res.add(levelNode);
        }
        return res;
    }
}
