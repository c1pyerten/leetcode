// Given a sorted linked list, delete all duplicates such that each element appear only once.


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatedSortedLists83 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode solution(ListNode head) {
        ListNode list = head;
        while (list != null && list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }

            // alternative
//            while (list.next != null && list.val == list.next.val) {
//                list.next = list.next.next;
//            }
//            list = list.next;
        }
        return head;
    }


    public ListNode solution2(ListNode head) {
        Set<Integer> set = new LinkedHashSet<>();
        ListNode copyHead = head;
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        head = copyHead;
        ListNode prev = null;
        for (Integer integer : set) {
            prev = head;
            head.val = integer;
            head = head.next;
        }
        prev.next = null;
        return copyHead;
    }

    public ListNode solution3(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = solution3(head.next);
        return head.val == head.next.val ? head.next : head;
    }

}
