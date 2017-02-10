// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//        For example,
//        Given nums = [0, 1, 3] return 2.
//
//        Note:
//        Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?


public class MissingNumber268 {
    public int solution(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return len* (len + 1) / 2 - sum;
        // return (int)(len*(len+1) - IntStream.of(nums).sum())
    }

    // bit manipulation
    public int solution2(int[] nums) {
        int len = nums.length;
        int i = 0;
        for (int num : nums) {
            len ^= num;
            len ^= i;
            i++;
        }
        return len;
    }
}
