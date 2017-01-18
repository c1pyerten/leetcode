// Given an integer, write a function to determine if it is a power of two.

public class PowerOfTwo231 {
    public boolean solution(int n) {
        // return n >= 0 && Integer.bitCount(n) == 1
        if (n > 0) {
            return Integer.bitCount(n) == 1;
        } else {
            return false;
        }
    }

    public boolean solution2(int n) {
        return n > 0 && (n & (n-1))==0;
    }

}
