// Remove all elements from a linked list of integers that have value val.


public class RemoveLinkedListElements206 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    // using recursive
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return removeElements(head.next, val);
        head.next = removeElements(head.next, val);
        return head;
    }

    // using iterative
    public ListNode removeElements2(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode dummyNode = head;
        while (dummyNode != null && dummyNode.next != null) {
            if (dummyNode.next.val == val) {
                dummyNode.next = dummyNode.next.next;
            } else dummyNode = dummyNode.next;
        }
        return head;
    }

}
