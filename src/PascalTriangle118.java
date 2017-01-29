// Given numRows, generate the first numRows of Pascal's triangle.
//
//        For example, given numRows = 5,
//        Return
//
//       [
//        [1],
//        [1,1],
//        [1,2,1],
//        [1,3,3,1],
//        [1,4,6,4,1]
//       ]


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public List<List<Integer>> solution(int rows) {
        List<List<Integer>> answer = new ArrayList<>();
        if (rows == 0) return answer;
        answer.add(new ArrayList<>());
        answer.get(0).add(1);

        for (int i = 1; i < rows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> prev = answer.get(i - 1);
            for (int j = 0; j <= prev.size(); j++) {
                int tmp;
                if (j == 0 || j == prev.size()) {
                    tmp = 1;
                } else {
                    tmp = prev.get(j) + prev.get(j - 1);
                }
                list.add(tmp);
            }
            answer.add(list);
        }
        return answer;
    }

    public List<List<Integer>> solution2(int rows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
            answer.add(new ArrayList<>(list));
        }
        return answer;
    }
}
