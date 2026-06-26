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
    boolean flag = true;
    TreeNode prev= null;
    public boolean isValidBST(TreeNode root) {
        if (root== null) {
            return flag;
        } 

        isValidBST(root.left);
        //TreeNode curr = root;
        if(prev!=null){
            if(prev.val>=root.val){
                flag =false;
                
            }            
        }
        prev = root;
        if(flag!=false){
            isValidBST(root.right);
        }
        
        return flag;
    }
}