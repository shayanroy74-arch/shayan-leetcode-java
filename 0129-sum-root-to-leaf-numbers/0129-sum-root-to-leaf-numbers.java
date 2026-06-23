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
    int sum = 0;
    int branch = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            branch = branch * 10 + root.val;
            System.out.println(branch);
            //int temp = branch;
            sum = sum + branch;
            branch = branch / 10;
            System.out.println(branch);
            return sum;
        }

        branch = branch * 10 + root.val;

        sumNumbers(root.left);
        sumNumbers(root.right);
        

       // sum = sum + ;
        branch = branch / 10;

       return sum;
    }
}