// Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
//
//        Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
//
//        Example:
//        Input:
//        [[0,0],[1,0],[2,0]]
//
//        Output:
//        2
//
//        Explanation:
//        The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]


import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs447 {
    public int solution(int[][] points) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int dis = distance(points[i], points[j]);
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
            // if only one distance, skip this. Whenever two more distances, calculate n * (n-1)
            for (Integer integer : map.values()) {
                answer += integer * (integer - 1);
            }
            map.clear();
        }

        return answer;
    }

    public int distance(int[] p1, int[] p2) {
        int d0 = p1[0] - p2[0];
        int d1 = p1[1] - p2[1];
        return d0*d0 + d1*d1;
    }
}
