/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node a=new Node(x);
        a.next=head;
        head=a;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        
        Node a=new Node(x);
        if(head==null)
        return a;
        Node ans=head;
        while(head.next!=null){
          head=head.next;
        }
        head.next=a;
        return ans;
    }
}
