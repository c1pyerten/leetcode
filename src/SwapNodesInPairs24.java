// Given a linked list, swap every two adjacent nodes and return its head.
//
//        For example,
//        Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//        Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.


public class SwapNodesInPairs24 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode solution(ListNode head) {
        if (head.next == null || head == null) return head;
        ListNode nextNode = head.next;
        head.next = solution(head.next.next);
        nextNode.next = head;
        return nextNode;
    }

    public ListNode solution2(ListNode head2) {
        // TODO: 2017/1/24
        return null;
    }
}
