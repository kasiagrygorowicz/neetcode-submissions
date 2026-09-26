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
    public int kthSmallest(TreeNode root, int k) {
        var stack = new Stack<TreeNode>();
        int n = 0;
        var current =root;

        while(current != null ||!stack.isEmpty()){
            while(current !=null){
                stack.push(current);
                current = current.left;
            }

            var popped = stack.pop();
            n = n+1;
            if(n == k){
                return popped.val;
            }

            current = popped.right;
        }

        return -1;
    }
}
