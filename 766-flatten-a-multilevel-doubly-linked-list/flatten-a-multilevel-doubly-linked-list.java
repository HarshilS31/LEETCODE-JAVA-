class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node childList = flatten(curr.child);
                curr.next = childList;
                childList.prev = curr;
                curr.child = null; 
                Node tail = childList;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = next;
                if (next != null) {
                    next.prev = tail;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}