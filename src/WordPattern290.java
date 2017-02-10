// Given a pattern and a string str, find if str follows the same pattern.
//
//        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//        Examples:
//        pattern = "abba", str = "dog cat cat dog" should return true.
//        pattern = "abba", str = "dog cat cat fish" should return false.
//        pattern = "aaaa", str = "dog cat cat dog" should return false.
//        pattern = "abba", str = "dog dog dog dog" should return false.
//        Notes:
//        You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.


import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();

        String[] strs = str.split("\\s");
        if (strs.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (patternMap.containsKey(c) && !patternMap.get(c).equals(strs[i])) {
                return false;
            }
            // if (patternMap.containValue(strs[i]) == false) return false;
            else if (strMap.containsKey(strs[i]) && strMap.get(strs[i]) != c) return false;
            else{
                patternMap.put(c, strs[i]);
                strMap.put(strs[i], c);
            }
        }
        return true;
    }

    public boolean wordPattern2(String pattern, String str) {
        String[] strs = str.split(" ");
        Map map = new HashMap();
        if (strs.length != pattern.length()) return false;
        // using != for Integer object compare
        for (Integer i = 0; i < pattern.length(); i++) {
            if (map.put(pattern.charAt(i), i) != map.put(strs[i], i)) {
                return false;
            }
        }
        // Objects.equals for int
//        for (int i = 0; i < pattern.length(); i++) {
//            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(strs[i], i))) {
//                return false;
//            }
//        }
        return true;
    }
}
