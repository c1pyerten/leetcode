// You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
//
//        Given n, find the total number of full staircase rows that can be formed.
//
//        n is a non-negative integer and fits within the range of a 32-bit signed integer.


public class ArrangingCoins441 {
    public int solution(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = (left - right) / 2;
            if ((mid + 1) * mid / 2 <= n) left = mid + 1;
            else right = mid - 1;
        }
        return left - 1;
    }

    public int solution2(int n) {
        return (int) (Math.sqrt(1 + 8 * (long) n) - 1) / 2;
    }
}


