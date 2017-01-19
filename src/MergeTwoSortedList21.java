// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.


public class MergeTwoSortedList21 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode solution(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode root = null;
        if (l1.val < l2.val)  {
            root = l1;
            helper(root, l1.next, l2);
            return root;
        }
        else {
            root = l2;
            helper(root, l1, l2.next);
            return root;
        }
    }

    private void helper(ListNode root, ListNode l1, ListNode l2) {
        if (l1 == null) {
            root.next = l2;
            return;
        }
        if (l2 == null){
            root.next = l1;
            return;
        }

        if (l1.val < l2.val) {
            root.next = l1;
            helper(root.next, l1.next, l2);
        } else {
            root.next = l2;
            helper(root.next, l1, l2.next);
        }
    }

    // very very elegant recursive !!
    public ListNode solution2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = solution2(l1.next, l2);
            return l1;
        } else {
            l2.next = solution2(l1, l2.next);
            return l2;
        }
    }

    public ListNode solution3(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode head = root;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }

        head.next = l1 == null ? l2 : l1;
        return root.next;
    }
}
