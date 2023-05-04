/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node dummy=new Node(0);
        dummy.next=head;
        Node slow=dummy;
        Node fast=head;
	 while(head!=null){
	     if(x--==1){
	         slow.next=fast.next;
	     }
	     head=head.next;
	     slow=slow.next;
	     fast=fast.next;
	 }	
	 return dummy.next;
    }
}
