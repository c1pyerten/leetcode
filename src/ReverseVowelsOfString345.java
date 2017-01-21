// Write a function that takes a string as input and reverse only the vowels of a string.

public class ReverseVowelsOfString345 {
    private String vowels = "aeiouAEIOU";

    public String solution(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < j && vowels.indexOf(chars[i]) == 0) {
                i++;
            }
            while (i < j && vowels.indexOf(chars[j]) == 0) {
                j--;
            }
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            i++;
            j--;
        }

        return new String(chars);
    }

    public String solution2(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (isVowel(sb.charAt(i))) {
                while (i < j) {
                    if (isVowel(sb.charAt(j))) {
                        swapChar(sb, i, j);
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return sb.toString();

    }


    private void swapChar(StringBuilder sb, int i, int j) {
        char t = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, t);
    }

    private boolean isVowel(char c) {
        String s = "aeiouAEIOU";
        return s.indexOf(c) >= 0;
    }
}
