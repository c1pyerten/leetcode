// Given a linked list, determine if it has a cycle in it.


public class LinkedListCycle141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public boolean solution(ListNode head) {
        if (head == null) return false;
        ListNode head2 = head;
        while (head2.next != null && head2.next.next != null) {
            head = head.next;
            head2 = head2.next.next;
            if (head2 == head) return true;
        }
        return false;
    }
}
