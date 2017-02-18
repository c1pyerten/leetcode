// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].


import java.util.Arrays;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Integer[] rank = new Integer[nums.length];
        for (int i = 0; i < rank.length; i++) {
            rank[i] = i;
        }
        Arrays.sort(rank, (a, b) -> (nums[a] - nums[b]));
        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            int index = binarySearch(nums, rank, anotherNum);
            if (index != -1) return new int[]{i, index};
        }
        return new int[]{0, 0};
    }

    private int binarySearch(int[] nums, Integer[] rank, int target) {
        int low = 0;
        int high = nums.length;

        while (low < high) {
            int mid = low / 2 + (high - low) / 2;
        }
        return 0;
    }
}

