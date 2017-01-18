// Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//        You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.


public class RepeatedSubstringPattern459 {
    public boolean solution(String s) {
        boolean flag;
        for (int i = s.length() / 2; i > 0; i--) {
            if (s.length() % i != 0) { continue; }
            flag = true;
            for (int j = i; j <= s.length() - i; j += i )  {
                if (!s.substring(0, i).equals(s.substring(j, j + i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }

        }
        return false;
    }
}
