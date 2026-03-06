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
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;
        
        ListNode s = head;
        ListNode f = head;  
        

        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;      
        }
        
        ListNode head2 = s.next;
        s.next = null;
        head = sortList(head);
        head2 = sortList(head2);
        return merge(head, head2);
    }
    
    static ListNode merge(ListNode head1, ListNode head2) {
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        
        while (i != null && j != null) {
            if (i.val < j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        
        if (i == null) 
            k.next = j;
        else 
            k.next = i;
            
        return dummy.next;
    }
}