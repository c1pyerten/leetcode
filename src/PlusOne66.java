// Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//
//        You may assume the integer do not contain any leading zero, except the number 0 itself.
//
//        The digits are stored such that the most significant digit is at the head of the list.


import java.util.Arrays;

public class PlusOne66 {
    public int[] solution(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if (digits[0] == 10) {
            int[] arr = new int[digits.length + 1];
            System.arraycopy(digits, 1, arr, 2, digits.length);
            arr[0] = 1;
            arr[1] = 0;
            return arr;
        } else return digits;
    }

    public int[] solution2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;
    }

}
