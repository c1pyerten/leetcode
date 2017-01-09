import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = "AACCGG";
        String str2 = "ACGACG";
        char[] ss1 = str1.toLowerCase().toCharArray();
        char[] ss2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ss1);
        Arrays.sort(ss2);
        System.out.println(Arrays.equals(ss1, ss2));

        System.out.println(new HammingDistance461().solution(7, 1));

    }

    public List<String> solution(int n) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tmp = "";
            if (i % 3 == 0) {
                tmp += "Fizz";
            }
            if (i % 5 == 0) {
                tmp += "Buzz";
            } else {
                tmp = Integer.toString(i);
            }
            al.add(tmp);
        }
        return al;
    }
}
