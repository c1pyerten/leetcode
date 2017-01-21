// Write a function that takes an unsigned integer and returns the number of ’1',
// bits it has (also known as the Hamming weight).
//
//        For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011,
//        so the function should return 3.


public class NumberOf1Bits191 {
    public int solution(int n) {
//        return Integer.bitCount(n);
        int answer = 0;
        while (n != 0) {
            answer += (n & 1);
            n >>>= 1;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        while (n != 0) {
            n = n & (n - 1);
            answer++;
        }
        return answer;
    }
}
