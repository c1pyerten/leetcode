// Given a column title as appear in an Excel sheet, return its corresponding column number.
//
//        For example:
//
//        A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28


public class ExcelSheetColumnNumber171 {
    // for (int i = 0; i < s.length(); answer = answer*26 + (s.charAt(i)-'A'+1), i++) ;
    public int solution(String s) {
        int answer = 0;
        for (int i = s.length() - 1; i >=0; i--) {
            int num = s.charAt(i) - 'A' + 1;
            answer += Math.pow(26, s.length() - 1 - i)*num;
        }
        return answer;
    }
}
