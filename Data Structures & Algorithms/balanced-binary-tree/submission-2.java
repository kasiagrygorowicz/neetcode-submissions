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
    public boolean isBalanced(TreeNode root) {
       return dfs(root) != -1;
    }

    private int dfs(TreeNode node){
        if(node==null){
            return 0;
        }

        var leftH = dfs(node.left);
        if(leftH == -1){
            return -1;
        }
        var rightH = dfs(node.right);
         if(rightH == -1){
            return -1;
        }
        var dif = Math.abs(rightH-leftH);
        if(dif > 1){
            return -1;
        }
        return Math.max(leftH, rightH) + 1;


    }
}
