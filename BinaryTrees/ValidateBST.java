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
    public  int prev=-1,f=0,ff=0;
    public boolean isValidBST(TreeNode root) {//also can use ArrayList
        helper(root);
        return ff==0;
    }
    public void helper(TreeNode root){
        if(root==null)
        return;
        helper(root.left);
        if(f==0){
        prev=root.val;
        f=1;
        }
        else{
        int curr=root.val;
        if(prev>=curr){
        ff=1;
        }
        prev=curr;
        }
        helper(root.right);
    }
}
