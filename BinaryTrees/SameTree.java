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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        helper(p,a);
        helper(q,b);
        return a.equals(b);
    }
    public void helper(TreeNode r,ArrayList<Integer> a){
        if(r!=null){
            helper(r.left,a);
            a.add(r.val);
            helper(r.right,a);
        }
        a.add(null);
    }
}
