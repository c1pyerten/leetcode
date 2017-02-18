// The count-and-say sequence is the sequence of integers beginning as follows:
//        1, 11, 21, 1211, 111221, ...
//
//        1 is read off as "one 1" or 11.
//        11 is read off as "two 1s" or 21.
//        21 is read off as "one 2, then one 1" or 1211.
//        Given an integer n, generate the nth sequence.


public class CountandSay38 {
    public String countAndSay(int n) {
        if (n == 0) return "";
        String prevStr = "1";
        while (--n > 0) {
            String cur = "";
            for (int i = 0; i < prevStr.length(); i++) {
                int count = 1;
                while (i + 1 < prevStr.length() && prevStr.charAt(i + 1) == prevStr.charAt(i)) {
                    count++;
                    i++;
                }
                cur += String.valueOf(count) + String.valueOf(prevStr.charAt(i));
            }
            prevStr = cur;
        }
        return prevStr;
    }
}
