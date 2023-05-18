class PathSumII {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public void dfs(TreeNode node, List<Integer> path, int remainSum)
    {
        if(node == null) return;

        path.add(node.val);

        if(node.left == null && node.right == null && node.val == remainSum) ans.add(new ArrayList<>(path));
        dfs(node.left, path, remainSum - node.val);
        dfs(node.right, path, remainSum - node.val);
        path.remove(path.size() - 1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        dfs(root, path, targetSum);
        return ans;
    }
}
