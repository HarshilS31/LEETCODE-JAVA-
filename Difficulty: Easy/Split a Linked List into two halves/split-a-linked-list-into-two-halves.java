/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        Node temp=head;
        while(temp.next!=head) {
            temp=temp.next;
        }
        temp.next=null;
        Node s=head;
        Node f=head;
        while(f.next!=null && f.next.next!=null) {
        s=s.next;
        f=f.next.next;
        
        }
        Node head2=s.next;
        s.next=head;
        Node temp2=head2;
        while(temp2.next!=null) {
        temp2=temp2.next;
        }
        temp2.next=head2;
        return new Pair <>(head,head2);
        
        
    }
    
    
}