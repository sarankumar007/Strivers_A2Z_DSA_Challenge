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
    public TreeNode searchBST(TreeNode r, int val) {
        while(true){
            if(val==r.val)
                return r;
           else if(val<r.val){
                if(r.left!=null)
                    r=r.left;
                else
                    break;
                    
            }
            else{
                if(r.right!=null) r=r.right;
                else
                    break;
            }
            
        }
        return null;
    }
}
