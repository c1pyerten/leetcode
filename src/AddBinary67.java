// Given two binary strings, return their sum (also a binary string).
//
//        For example,
//        a = "11"
//        b = "1"
//        Return "100".


// TODO review
public class AddBinary67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int tmp = carry;
            if (i >= 0) tmp += a.charAt(i--) - '0';
            if (j >= 0) tmp += b.charAt(j--) - '0';
            sb.append(tmp % 2);
            carry = tmp / 2;
        }
        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}
