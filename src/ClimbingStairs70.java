// You are climbing a stair case. It takes n steps to reach to the top.
//
//        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//        Note: Given n will be a positive integer.


import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs70 {
    private Map<Integer, Integer> map = new HashMap<>();

    public int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.getOrDefault(n, null) != null) return map.get(n);
        map.put(n, solution(n - 1) + solution(n-2));
        return map.get(n);
    }

    public int solution2(int n) {
        if (n < 3) {
            return n;
        }

        int[] table = new int[n+1];
        table[1] = 1;
        table[2] = 2;
        for (int i = 3; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }
}
