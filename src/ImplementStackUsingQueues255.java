// Implement the following operations of a stack using queues.
//
//        push(x) -- Push element x onto stack.
//        pop() -- Removes the element on top of the stack.
//        top() -- Get the top element.
//        empty() -- Return whether the stack is empty.
//        Notes:
//        You must use only standard operations of a stack -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
//        Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended stack), as long as you use only standard operations of a stack.
//        You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).


import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues255 {
    Queue<Integer> stack;

    /** Initialize your data structure here. */
    public ImplementStackUsingQueues255() {
        stack = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
        for (int i = 1; i < stack.size(); i++) {
            stack.add(stack.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return stack.remove();
    }

    /** Get the top element. */
    public int top() {
        return stack.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
