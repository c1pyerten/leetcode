// Reverse a singly linked list.

public class ReverseLinkedList206 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    // iterative
    public ListNode solution(ListNode head) {
        ListNode prevHead = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prevHead;
            prevHead = head;
            head = next;
        }
        return prevHead;
    }

    // recursive
    public ListNode solution2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = null;
        ListNode newHead = solution2(next);
        next.next = head;
        return newHead;
    }
}
