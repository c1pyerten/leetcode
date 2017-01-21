// Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
//
//        Example:
//        Given num = 16, return true. Given num = 5, return false.
//
//        Follow up: Could you solve it without loops/recursion?


public class PowerOfFour342 {
    public boolean solution(int n) {
        if (n <= 0) return false;

        while (n != 1) {
            if (n % 4 == 0) n /= 4;
            else return false;
        }
        return true;
    }

    public boolean solutin2(int n) {
        return n > 0 && (n == 1 || (n % 4 == 0 && solutin2(n / 4)));
    }

    // 4^n = (4-1)(4^(n-1) + 4^(n-2) + ... + 4 + 1)
    public boolean solution3(int n) {
        return n > 0 && (n & n - 1) == 0 && (n - 1) % 3 == 0;
    }

    // 10101010101010101... make sure no odd positions be 1
    public boolean solution4(int n) {
        return n > 0 && (n & n-1)==0 && (n & 0x55555555)==n;
    }
}
