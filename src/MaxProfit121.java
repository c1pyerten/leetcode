// Say you have an array for which the ith element is the price of a given stock on day i.
//
//        If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//        Example 1:
//        Input: [7, 1, 5, 3, 6, 4]
//        Output: 5
//
//        max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)


public class MaxProfit121 {
    public int solution(int[] nums) {
        int max, maxCur;
        maxCur = 0;
        max = 0;
        for (int i = 1; i < nums.length; i++) {
            maxCur += nums[i] - nums[i - 1];
            maxCur = Math.max(0, maxCur);
            max = Math.max(max, maxCur);
        }
        return max;
    }

    public int solution2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        int max = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (min < nums[i]) {
                min = nums[i];
            } else {
                max = Math.max(max, nums[i] - min);
            }
        }
        return max;
    }
}
