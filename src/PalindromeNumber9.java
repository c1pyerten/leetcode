// Determine whether an integer is a palindrome. Do this without extra space.


public class PalindromeNumber9 {
    public boolean solution(int n) {
        if (n < 0 || (n != 0 && n % 10 == 0)) return false;
        int tmp = 0;
        while (n > tmp) {
            tmp = tmp * 10 + n % 10;
            n /= 10;
        }
        return n == tmp || tmp/10 == n;
    }
}
