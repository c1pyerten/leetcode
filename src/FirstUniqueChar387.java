// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//        Examples:
//
//        s = "leetcode"
//        return 0.
//
//        s = "loveleetcode",
//        return 2.
//        Note: You may assume the string contain only lowercase letters.


public class FirstUniqueChar387 {
    public int solution(String s) {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            table[idx]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (table[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
