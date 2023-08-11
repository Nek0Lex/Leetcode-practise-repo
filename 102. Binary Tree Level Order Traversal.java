//https://leetcode.com/problems/binary-tree-level-order-traversal/

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

 // recusive traversal 
 // pass a level as indicator -> put it in nested list
class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();;

    public void traversal(TreeNode root, int level){
        if(levels.size() == level) levels.add(new ArrayList<Integer>());
        
        levels.get(level).add(root.val);

        if(root.left != null){
            traversal(root.left, level+1);
        }

        if(root.right != null){
            traversal(root.right, level+1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return levels;
        traversal(root, 0);
        return levels;
    }
}