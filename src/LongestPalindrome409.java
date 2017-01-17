// Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
//        This is case sensitive, for example "Aa" is not considered a palindrome here.
//
//        Note:
//        Assume the length of given string will not exceed 1,010.
//
//        Example:
//
//        Input:
//        "abccccdd"
//
//        Output:
//        7
//
//        Explanation:
//        One longest palindrome that can be built is "dccaccd", whose length is 7.


import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome409 {
    public int solution(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }
        return s.length() - set.size() + (set.size() == 0 ? 0 : 1);

    }

    public int solution2(String s) {
        int[] lowerTable = new int[26];
        int[] upperTable = new int[26];
        int answer = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a') lowerTable[c - 'a']++;
            else upperTable[c-'A']++;
        }
        for (int i = 0; i < 26; i++) {
            answer += (lowerTable[i] / 2) * 2;
            answer += (upperTable[i] / 2) * 2;
        }
        return answer == s.length() ? answer : answer + 1;
    }
}
