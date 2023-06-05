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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
        return new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
            l.add(curr.val);

        }
        list.add(l);
        }
        return list;
    }
}
