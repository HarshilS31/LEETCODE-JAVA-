/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        Node temp=head;
        int count=0;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        Node temp2=head;
            int idx=0;
            while(temp2!=null && idx<count/2)  {
                temp2=temp2.next;
                idx++;
                
            }
        return temp2.data;
        
         
        
        
       
        
    }
}