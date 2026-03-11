class Solution {
    public Node rotateDLL(Node head, int p) {
        if (head == null || head.next == null) return head;
        int size = len(head);
        p = p % size;
        if (p == 0) return head;
        Node temp = head;
        for (int i = 1; i < p; i++) {
            temp = temp.next;
        }
        Node newHead = temp.next;
        if (newHead == null) return head;
        temp.next = null;
        newHead.prev = null;
        Node last = newHead;
        while (last.next != null) {
            last = last.next;
        }
        last.next = head;
        head.prev = last;
        return newHead;
    }
    
    int len(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {  
            temp = temp.next;
            count++;
        }
        return count;
    }
}