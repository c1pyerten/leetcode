// Given a singly linked list, determine if it is a palindrome.
//
//        Follow up:
//        Could you do it in O(n) time and O(1) space?


public class PalindromeLinkedList234 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);
        slow = slow.next;
        while (slow != null) {
            if (slow.val != head.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode cur) {
        if (cur.next == null) return cur;

        ListNode next = cur.next;
        cur.next = null;
        ListNode newHead = reverseList(next);
        next.next = cur;
        return newHead;
    }

    private ListNode reverseList2(ListNode cur) {
        ListNode prev = null;
        while (cur!= null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
