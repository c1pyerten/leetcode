// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//        Find all the elements of [1, n] inclusive that do not appear in this array.
//
//        Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
//        Example:
//
//        Input:
//        [4,3,2,7,8,2,3,1]
//
//        Output:
//        [5,6]


import java.util.*;

public class FindDisappearedNumbers448 {
    public List<Integer> solution(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = Math.abs(nums[i]) - 1;
            if (nums[tmp] > 0) {
                nums[tmp] = -nums[tmp];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                answer.add(i+1);
            }
        }
        return answer;

    }

    public static void show(List<Integer> list) {
        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
