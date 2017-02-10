// Total Accepted: 91285
//        Total Submissions: 279513
//        Difficulty: Easy
//        Contributors: Admin
//        Given two strings s and t, determine if they are isomorphic.
//
//        Two strings are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//        For example,
//        Given "egg", "add", return true.
//
//        Given "foo", "bar", return false.
//
//        Given "paper", "title", return true.


public class IsomorphicStrings205 {
    // mapping occur
    public boolean solution(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] table = new int[256];
        boolean[] isMaped = new boolean[256];
        for (int i = 0; i <s.length() ; i++) {
            if (table[s.charAt(i)] == 0 && !isMaped[t.charAt(i)]) {
                table[s.charAt(i)] = t.charAt(i);
                isMaped[t.charAt(i)] = true;
            } else if (table[s.charAt(i)] != t.charAt(i)) return false;
        }
        return true;
    }

    // count the frequency
    // TODO check
    public boolean solution2(String s, String t) {
        int[] table1 = new int[256];
        int[] table2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int sc = s.charAt(i);
            int tc = t.charAt(i);
            if (table1[sc] != table2[tc]) return false;
            table1[sc] = i + 1;
            table2[tc] = i + 1;
        }
        return true;
    }
}
