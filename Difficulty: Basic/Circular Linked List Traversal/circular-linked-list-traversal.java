/* Node of a linked list
 class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
*/

class Solution {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        Node temp=head;
        while(temp.next!=head) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
        System.out.print(temp.data);
        
        
        
    }
}