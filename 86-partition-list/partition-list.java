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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode i=dummy1;//for smaller values
        ListNode j=dummy2;//for larger values
        ListNode temp=head;
        while(temp!=null) {
            if(temp.val<x) {
                i.next=temp;
                 i=i.next;
            }
            else {
                j.next=temp;
                j=j.next;     
            }
            temp=temp.next;

        }
        i.next=dummy2.next;
        j.next=null;
        return dummy1.next;

        
        



        





        
    }
}