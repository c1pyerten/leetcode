// Given a positive integer num, write a function which returns True if num is a perfect square else False.
//
//        Note: Do not use any built-in library function such as sqrt.


public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public boolean isPerfectSquare2(int num) {
        int low = 0;
        int high = num;
        while (low < high) {
            int mid = low / 2 + (high - low) / 2;
            if (mid * mid < num) low = mid + 1;
            else if (mid * mid > num) high = mid - 1;
            else return true;
        }
        return false;
    }
}
