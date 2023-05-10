/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // while(headA!=null){
        //     ListNode a=headB;
        //     while(a!=null){
        //         if(a==headA) return a;
        //         a=a.next;
        //     }
        //     headA=headA.next;
        // }
        // return null;
        //method 2:using hashSet
    //     HashSet<ListNode>a=new HashSet<>();
    //     while(headA!=null){
    //         a.add(headA);
    //         headA=headA.next;
    //     }
    //     while(headB!=null){
    //         if(a.contains(headB))
    //         return headB;
    //         headB=headB.next;
    //     }
    //     return null;
    //method 3:using dummy nodes optimal 
    if(headA==null || headB==null)
    return null;
    ListNode a=headA;
    ListNode b=headB;
    while(a!=b){
        a=a==null?headB:a.next;
        b=b==null?headA:b.next;
    }
    return b;

     }
}
