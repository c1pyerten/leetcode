//Write a program that outputs the string representation of numbers from 1 to n.
//
//        But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
//
//        Example:
//
//        n = 15,
//
//        Return:
//        [
//        "1",
//        "2",
//        "Fizz",
//        "4",
//        "Buzz",
//        "Fizz",
//        "7",
//        "8",
//        "Fizz",
//        "Buzz",
//        "11",
//        "Fizz",
//        "13",
//        "14",
//        "FizzBuzz"
//        ]

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
