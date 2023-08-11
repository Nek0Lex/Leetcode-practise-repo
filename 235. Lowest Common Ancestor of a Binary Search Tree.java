//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // Recursion to traversal the BST
 // if both p, q -> less/large than root node -> recur to next root

 class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int rtVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        
        if(pVal > rtVal && qVal > rtVal){
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < rtVal && qVal < rtVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }
}