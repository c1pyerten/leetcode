// Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
// Note:
//        N is a positive integer and won't exceed 10,000.
//        All the scores of athletes are guaranteed to be unique.


import java.util.Arrays;

public class RelativeRanks506 {
    public String[] findRelativeRanks(int[] nums) {
        int[] rank = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pos = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[pos]) pos = j;
            }
            rank[i] = pos;
            nums[pos] = -1;
        }

        String[] answer = new String[nums.length];
        answer[rank[0]] = "Gold Medal";
        if (nums.length > 1)
            answer[rank[1]] = "Silver Medal";
        if (nums.length > 2)
            answer[rank[2]] = "Bronze Medal";
        for (int i = 3; i < nums.length; i++) {
            answer[rank[i]] = String.valueOf(i+1);
        }
        return answer;
    }

    public String[] findRelativeRanks2(int[] nums) {
        Integer[] rank = new Integer[nums.length];
        for (int i = 0; i < rank.length ; i++) {
            rank[i] = i;
        }
        Arrays.sort(rank, (a, b) -> nums[b] - nums[a]);
        String[] answer = new String[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if (i == 0) answer[rank[i]] = "Gold Medal";
            else if (i == 1) answer[rank[i]] = "Silver Medal";
            else if (i == 2) answer[rank[i]] = "Bronze Medal";
            else answer[rank[i]] = String.valueOf(i + 1);
        }
        return answer;
    }
}
