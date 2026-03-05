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
     public int length(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null) {
            temp=temp.next;
            len++;
        }
        return len; 
 }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n=length(head);
        k%=n;
        if(k==0) return head;
        ListNode s=head;
        ListNode f=head;
        for(int i=1;i<=k+1;i++) {
            f=f.next;

        }
        while(f!=null) {
            s=s.next;
            f=f.next;
        }
        ListNode a=s.next;
        s.next=null;
        ListNode tail=a;

        while(tail.next!=null) {
            tail=tail.next;
        }
        tail.next=head;
        return a;
        }

        
    
}