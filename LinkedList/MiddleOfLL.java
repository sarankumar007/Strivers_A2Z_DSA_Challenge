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
    public ListNode middleNode(ListNode head) {
        // short c=0;
        // ListNode res=head;
        // while(res!=null){
        //     res=res.next;
        //     c++;
        // }
        // for(int i=0;i<c/2;i++){
        //     head=head.next;
        // }
        // return head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
}
