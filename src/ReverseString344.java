//Write a function that takes a string as input and returns the string reversed.
//
//        Example:
//        Given s = "hello", return "olleh".
public class ReverseString344 {
    public String solution(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
