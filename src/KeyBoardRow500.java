// Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
// Example 1:
//        Input: ["Hello", "Alaska", "Dad", "Peace"]
//        Output: ["Alaska", "Dad"]
//        Note:
//        You may use one character in the keyboard more than once.
//        You may assume the input string will only contain letters of alphabet.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class KeyBoardRow500 {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "adfghjkl", "zxcvbnm"};
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

    public String[] ff(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(char c: strs[i].toCharArray()){
                map.put(c, i);//put <char, rowIndex> pair into the map
            }
        }
        List<String> res = new ArrayList<>();
        for(String w: words){
            if(w.equals("")) continue;
            int index = map.get(w.toUpperCase().charAt(0));
            for(char c: w.toUpperCase().toCharArray()){
                if(map.get(c)!=index){
                    index = -1; //don't need a boolean flag.
                    break;
                }
            }
            if(index!=-1) res.add(w);//if index != -1, this is a valid string
        }
        return res.toArray(new String[0]);
    }

    public String[] findWords2(String[] words) {
        return Stream.of(words).filter(word -> word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}

