// Write an algorithm to determine if a number is "happy".
//
//        A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//
//        Example: 19 is a happy number
//
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1


import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public boolean solution(int n) {
        Set<Integer> set = new HashSet<>();
        int tmp;
        while (set.add(n)) {
            tmp = 0;
            while (n != 0) {
                tmp += (n % 10) * (n % 10);
                n /= 10;
            }
            if (tmp == 1) return true;
            else n = tmp;
        }
        return false;
    }

    public boolean solution2(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = getDigitNum(slow);
            fast = getDigitNum(fast);
            fast = getDigitNum(fast);
        } while (slow != fast);

        return fast == 1;
    }

    private int getDigitNum(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}
