import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null)
                    queue.offer(currentNode.left);
                if(currentNode.right != null)
                    queue.offer(currentNode.right);
                if(i == size - 1)
                    res.add(currentNode.val);
            }
        }
        return res;
    }
}