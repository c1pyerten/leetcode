// Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
//
//        Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
//
//        The order of output does not matter.
//
//        Example 1:
//
//        Input:
//        s: "cbaebabacd" p: "abc"
//
//        Output:
//        [0, 6]
//
//        Explanation:
//        The substring with start index = 0 is "cba", which is an anagram of "abc".
//        The substring with start index = 6 is "bac", which is an anagram of "abc".
//        Example 2:
//
//        Input:
//        s: "abab" p: "ab"
//
//        Output:
//        [0, 1, 2]
//
//        Explanation:
//        The substring with start index = 0 is "ab", which is an anagram of "ab".
//        The substring with start index = 1 is "ba", which is an anagram of "ab".
//        The substring with start index = 2 is "ab", which is an anagram of "ab".


import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString438 {
    // using string compare
    public List<Integer> solution(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()) return list;
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (this.compareHelper(s.substring(i, i+p.length()), p)) list.add(i);
        }
        return list;
    }

    private boolean compareHelper(String s1, String s2) {
        int[] table = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            table[c-'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (--table[c - 'a'] < 0) return false;
        }
        return true;
    }

    // using window slide
    // TODO check
    public List<Integer> solution2(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()) return list;
        int[] table = new int[26];
        for (char c : p.toCharArray()) {
            table[c - 'a']++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (right - left == p.length() && table[s.charAt(left++) - 'a']++ >= 0) count++;
            if (--table[s.charAt(right) - 'a'] >= 0) count--;
            if (count == 0) list.add(left);
        }
        return list;
    }
}
