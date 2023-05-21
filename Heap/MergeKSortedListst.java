/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(ListNode i:lists){
            ListNode b=i;
            while(b!=null){
                heap.add(b.val);
                b=b.next;
            }
        }

        ListNode ans=new ListNode(0);
        ListNode y=ans;
        int size=heap.size();
        for(int i=0;i<size;i++){
            ans.next=new ListNode(heap.remove());
            ans=ans.next;
        }
        return y.next;
    }
}
