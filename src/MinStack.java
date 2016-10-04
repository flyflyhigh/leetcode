import java.util.Stack;

/**
 155. Min Stack

 Difficulty: Easy
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 Example:
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.

 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    public void push(int x){
        stack.push(x);
        min.push(min.isEmpty() ? x : Math.min(x, min.peek()));
    }
    public void pop(){
        stack.pop();
        min.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return min.peek();
    }
}
