import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> solution(int n) {
        ArrayList<String> list = new ArrayList<>();
        int fizz = 0;
        int buzz = 0;
        for (int i = 1; i <= n; i++) {
            String tmp = "";
            fizz++;
            buzz++;
            if (fizz == 3) {
                tmp += "Fizz";
                fizz = 0;
            }
            if (buzz == 5) {
                tmp += "Buzz";
                buzz = 0;
            }
            if (tmp.equals("")) {
                tmp = Integer.toString(i);
            }
            list.add(tmp);
        }
        return list;


    }
}
