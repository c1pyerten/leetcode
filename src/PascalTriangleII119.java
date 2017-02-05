// Given an index k, return the kth row of the Pascal's triangle.
//
//        For example, given k = 3,
//        Return [1,3,3,1].
//
//        Note:
//        Could you optimize your algorithm to use only O(k) extra space?


import java.util.ArrayList;
import java.util.List;

// TODO review again
public class PascalTriangleII119 {
    public List<Integer> solution(int row) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < row + 1; i++) {
            list.add(0, 1);
            // list.size() - 1
            for (int j = 1; j < i ; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
            // using backwards
            // for (int j = i - 1; j > 0 ; j--) {
            //     list.set(j, list.get(j) + list.get(j - 1));
            // }
        }
        return list;
    }
}

