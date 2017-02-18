// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//        If the last word does not exist, return 0.
//
//        Note: A word is defined as a character sequence consists of non-space characters only.


public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        // return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
        if (s.equals("")) return 0;
        String[] words =  s.split("\\s+");
        if (words.length > 0) {
            return words[words.length - 1].length();
        } else {
            return 0;
        }
    }
}
