// Given an integer n, return the number of trailing zeroes in n!.
//
//        Note: Your solution should be in logarithmic time complexity.


public class FactorialTrailingZeroes172 {
    public int solution(int n) {
        return n == 0 ? 0 : n / 5 + solution(n / 5);
    }
}
