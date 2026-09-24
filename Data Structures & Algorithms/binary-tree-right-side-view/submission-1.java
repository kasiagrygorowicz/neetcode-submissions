/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        var result = new ArrayList<Integer>();
        if(root==null) return result;
        var current = root;
        queue.add(root);
        while(!queue.isEmpty()){
            var n = queue.size();
            TreeNode lastNode =null;
            for(int i =0; i<n;i++){
                var node = queue.poll();
                if(node.left!=null)  queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                lastNode = node;
            }
            result.add(lastNode.val);

        }
        return result;
    }
}
