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
    public int goodNodes(TreeNode root) {
    
        if(root == null) return 0;

        return dfs(root, root.val);
    }


    private int dfs(TreeNode node, int maxValue){
            int goodNodes =0;
            if(node == null) return 0;

            if(node.val >= maxValue){
                maxValue = node.val;
                goodNodes=1;
            }
            goodNodes = goodNodes + dfs(node.left, maxValue);
            goodNodes = goodNodes + dfs(node.right, maxValue);
            return goodNodes;
    }
}
