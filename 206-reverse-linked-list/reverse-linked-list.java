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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head; 
        ArrayList<ListNode> l=new ArrayList<>();
        while(temp!=null) {
            l.add(temp);
            temp=temp.next;
        }
        int len=l.size();
        for(int i=len-1;i>=1;i--) {
            ListNode t1=l.get(i);
            ListNode t2=l.get(i-1);
            t1.next=t2;

        }

        l.get(0).next=null;
        return l.get(len-1);



        
        
    }
}