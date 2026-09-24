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
    public List<List<Integer>> levelOrder(TreeNode root) {
        var queue = new ArrayDeque<TreeNode>();
         var result = new ArrayList<List<Integer>>();

        if(root == null){
            return result;
        }
        queue.add(root);
       
        while(queue.size()!=0){
            var n = queue.size();
            var lvl = new ArrayList<Integer>();
            for(int i =0; i<n;i++){
                var node = queue.pop();
                lvl.add(node.val);
                if(node.left!=null){
                queue.add(node.left);
                }
                if(node.right!=null){
                queue.add(node.right);
                }
            }
            result.add(lvl);
        }

        return result;
    }
}
