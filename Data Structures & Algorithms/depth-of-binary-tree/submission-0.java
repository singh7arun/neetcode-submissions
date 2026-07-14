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
    

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return calculateDepth(root, 1);
    }

    private int calculateDepth(TreeNode node, int depth){
        if (node.left == null && node.right == null){
            return depth;
        }
        int leftDepth = 0;
        if (node.left != null){
            leftDepth = calculateDepth(node.left, depth+1);
        }
        int rightDepth = 0;
        if (node.right != null){
            rightDepth = calculateDepth(node.right, depth+1);
        }
        return rightDepth > leftDepth ? rightDepth : leftDepth;
    }
}
