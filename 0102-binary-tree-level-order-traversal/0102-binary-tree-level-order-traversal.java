class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> nodes;

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            nodes = new ArrayList<>(size);
            
            for(int i=0;i<size;i++){
                TreeNode currentNode = queue.poll();
                nodes.add(currentNode.val);
                
                if(currentNode.left != null)
                    queue.offer(currentNode.left);
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            level++;
            res.add(nodes);
        }
        return res;
    }
}