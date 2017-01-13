// Given an arbitrary ransom note string and another string containing letters from all the magazines,
// write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//
//        Each letter in the magazine string can only be used once in your ransom note.
//
//        Note:
//        You may assume that both strings contain only lowercase letters.
//
//        canConstruct("a", "b") -> false
//        canConstruct("aa", "ab") -> false
//        canConstruct("aa", "aab") -> true


import java.util.HashMap;
import java.util.Map;

public class RansomNotes383 {

    public boolean solution(String ransomNote, String magazine) {
        int[] table = new int[26];
        for (char c : magazine.toCharArray()) {
            table[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--table[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean solution2(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            int cnt = map.containsKey(c) ? map.get(c) + 1 : 1;
            map.put(c, cnt);
        }
        for (char c : ransomNote.toCharArray()) {
            if ((!map.containsKey(c)) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}

