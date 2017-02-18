//Implement the following operations of a queue using stacks.
//
//        push(x) -- Push element x to the back of stack.
//        pop() -- Removes the element from in front of stack.
//        peek() -- Get the front element.
//        empty() -- Return whether the stack is empty.
//
//        Notes:
//        You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
//        Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended stack), as long as you use only standard operations of a stack.
//        You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty stack).


import java.util.Stack;

public class ImplementQueueUsingStacks232 {
    Stack<Integer> st;

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks232() {
        st = new Stack<>();
    }

    /** Push element x to the back of stack. */
    public void push(int x) {
        st.push(x);
    }

    /** Removes the element from in front of stack and returns that element. */
    public int pop() {
        int tmp = st.get(0);
        st.remove(0);
        return tmp;
    }

    /** Get the front element. */
    public int peek() {
        int tmp = st.get(0);
        return tmp;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return st.empty();
    }
}

/**
 * Your ImplementQueueUsingStacks232 object will be instantiated and called as such:
 * ImplementQueueUsingStacks232 obj = new ImplementQueueUsingStacks232();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
