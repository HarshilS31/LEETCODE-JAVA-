/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node prev=null;
        Node curr=head;
        Node fwd=null;
        while(curr!=null) {
            
            fwd=curr.next;
            curr.next=prev;
            curr.prev=fwd;
            prev=curr;
            curr=fwd;
            
        }
        return prev;
        
        
        
        
        
        
    }
}