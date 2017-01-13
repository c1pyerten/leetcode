// Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
// where a move is incrementing n - 1 elements by 1.
//
//        Example:
//
//        Input:
//        [1,2,3]
//
//        Output:
//        3
//
//        Explanation:
//        Only three moves are needed (remember each move increments two elements):
//
//        [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]


import java.util.Arrays;
import java.util.stream.IntStream;

public class MinimumMoves453 {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            answer += nums[i] - nums[0];
        }
        return answer;
    }

    public int solution2(int[] nums) {
        return IntStream.of(nums).sum() - nums.length * IntStream.of(nums).min().getAsInt();

    }
}
