// Given two arrays, write a function to compute their intersection.
//
//        Example:
//        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
//
//        Note:
//        Each element in the result should appear as many times as it shows in both arrays.
//        The result can be in any order.
//        Follow up:
//        What if the given array is already sorted? How would you optimize your algorithm?
//        What if nums1's size is small compared to nums2's size? Which algorithm is better?
//        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionTwoArraysII350 {
    public int[] solution(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
