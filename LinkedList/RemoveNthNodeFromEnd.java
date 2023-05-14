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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode t=head;
        // ListNode ans=head;
        // int len=0;
        // while(head!=null){
        //     len++;
        //     head=head.next;
        // }
        //   int k=len-n,i=0;
        // if(len==1 && n==1)
        //     return new ListNode().next;
        
        // if(k==0)
        //     return t.next;
      
        // while(t!=null){
        //      i++;
        //     if(i==k){
        //     t.next=t.next.next;
        //         break;
        //     }
        //     t=t.next;
           
        // }
        // return ans;
        ListNode a=new ListNode();
        a.next=head;
        ListNode fast=a;
        ListNode slow=a;
        for(int i=0;i<n;i++) fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return a.next;
    }
}
