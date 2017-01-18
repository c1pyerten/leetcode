// Given an integer, write a function to determine if it is a power of three.
//
//        Follow up:
//        Could you do it without using any loop / recursion?


public class PowerOfThree326 {
    public boolean solution1(int n) {
        return n > 0 && (n == 1 || (n % 3) == 0 && solution1(n / 3));
    }


    public boolean solution2(int n) {
        if (n == 0) return false;

        int maxPow3 = (int)Math.pow(3, 19);
        return maxPow3 % 3 == 0;
    }
}
