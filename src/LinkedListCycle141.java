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
        return true;
    }

    public static void main(String[] args) {
        int k = 0;
        int count = 0;
        while (k <= 8) {
            System.out.println(count);
            count++;
            k = k + count;
        }

    }
}
