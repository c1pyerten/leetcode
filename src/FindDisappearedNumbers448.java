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
