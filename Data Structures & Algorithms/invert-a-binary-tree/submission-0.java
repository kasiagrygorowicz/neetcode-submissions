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
    public TreeNode invertTree(TreeNode root) {
        TreeNode newRoot = new TreeNode();

        return returnChildNode(root);
    }

        private static TreeNode returnChildNode(TreeNode node){
            if(node == null){
                return node;
            }
           TreeNode newRight =null;
           TreeNode newLeft = null;

                if(node.left !=null){
                    newRight = returnChildNode(node.left);
                }

                if(node.right!=null){
                    newLeft = returnChildNode(node.right);
                }
            
            node.right = newRight;
            node.left = newLeft;
            return node;
        
    }
}
