// Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//        For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//        the contiguous subarray [4,-1,2,1] has the largest sum = 6.


// TODO check
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int result = nums[0];
        dp[0] = nums[0];

        for (int i = 1; i <nums.length ; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
