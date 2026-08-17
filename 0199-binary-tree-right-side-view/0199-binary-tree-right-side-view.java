class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        if(root == null)
            return view;
        dfs(root,0,view);
        return view;
    }

    public void dfs(TreeNode root, int level, List<Integer> view) {
        if(root == null)
            return;
        if(level == view.size())
            view.add(root.val);
        dfs(root.right,level+1,view);
        dfs(root.left,level+1,view);
    }
}