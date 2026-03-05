/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;

        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null) {
            s=s.next;
            f=f.next.next;
            if(s==f) {
                ListNode n=head;
                while(n!=s) {
                    n=n.next;
                    s=s.next;

                }
                return n;

            }
            
        }
        return null;



        
    }
}