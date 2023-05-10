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
    public boolean isPalindrome(ListNode head) {
             Stack<Integer>stk=new Stack<>();
        ListNode curr=head;
        while(head!=null){
            stk.push(head.val);
            head=head.next;
        }
        while(curr!=null){
            if(stk.pop()!=curr.val) return false;
            curr=curr.next;
        }
        
        return true;
    }
}
