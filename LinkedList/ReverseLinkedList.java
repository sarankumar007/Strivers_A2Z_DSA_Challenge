/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
      Node prev=null;
      while(head!=null){
          Node next=head.next;
          head.next=prev;
          prev=head;
          head=next;
      }
      return prev;
    }
}
