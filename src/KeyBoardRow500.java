// Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
// Example 1:
//        Input: ["Hello", "Alaska", "Dad", "Peace"]
//        Output: ["Alaska", "Dad"]
//        Note:
//        You may use one character in the keyboard more than once.
//        You may assume the input string will only contain letters of alphabet.


import java.security.Key;
import java.util.*;
import java.util.stream.Stream;

public class KeyBoardRow500 {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            for (char c : row.toCharArray()) {
                map.put(c, i);
            }
        }
        for (String word : words) {
            if (word.equals("")) continue;
            int index = map.get(word.toLowerCase().charAt(0));
            for (char c : word.toLowerCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) list.add(word);
        }
        return list.toArray(new String[0]);
    }

    public String[] findWords2(String[] words) {
        return Stream.of(words).filter(word -> word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        new KeyBoardRow500().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    }
}

