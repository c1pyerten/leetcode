// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//        You may assume that the array is non-empty and the majority element always exist in the array.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            if (!map.containsKey(n)) map.put(n, 1);
            else map.put(n, map.get(n) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() >= nums.length / 2) { return entry.getKey(); }
        }
        return 0;
    }

    public int solution2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int solution3BitCount(int[] nums) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            int ones = 0;
            int zeroes = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) == 0) zeroes++;
                else ones++;
            }

            if (ones > zeroes) {
                ret = ret | (1 << i);
            }
        }
        return ret;
    }

}
