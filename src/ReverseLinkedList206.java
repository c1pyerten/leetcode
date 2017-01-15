// Reverse a singly linked list.

public class ReverseLinkedList206 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

//    public ListNode solution(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode prev = head;
//        ListNode next = null;
//        prev.next = null;
//        head = head.next;
//
//        while (head.next != null) {
//            next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        }
//        head.next = prev;
//        return head;
//    }

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
}
