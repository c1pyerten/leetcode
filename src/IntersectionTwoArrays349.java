// Given two arrays, write a function to compute their intersection.
//
//        Example:
//        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
//
//        Note:
//        Each element in the result must be unique.
//        The result can be in any order.


import java.util.*;

public class IntersectionTwoArrays349 {
    public int[] solution1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);

        int[] answer = new int[set1.size()];
        int idx = 0;
        for (Integer integer : set1) {
            answer[idx++] = integer;
        }
        return answer;

    }
}
