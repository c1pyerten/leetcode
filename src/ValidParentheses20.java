// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char topC = st.pop();
                if (!isPair(topC, c)) return false;
            }
        }
        return st.isEmpty();
    }

    private boolean isPair(char c1, char c2) {
        if (c1 == '(') return c2 == ')';
        if (c1 == '[') return c2 == ']';
        if (c1 == '{') return c2 == '}';
        return true;
    }

    public boolean isValid2(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '[') st.push(']');
            else if (c == '{') st.push('}');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
}
