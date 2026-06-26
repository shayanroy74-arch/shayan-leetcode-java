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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> contain = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            level = level + 1;
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                ans.add(curr.val);

                if (i == size - 1) {
                    if(level%2 != 0){
                        contain.add(ans);
                    }
                    else{
                        Collections.reverse(ans);
                        contain.add(ans);
                    }
                    
                }
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }

            }

        }
        return contain;
    }
}