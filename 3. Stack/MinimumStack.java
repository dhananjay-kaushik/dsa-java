import java.util.Stack;

/*
 * Stack is LIFO structure (Last In First Out)
 * Gettig minimum of stack is O(n) operation hard-coded. To get the minimum
 * in O(1) we need to manage a separate stack which keep record of minimum
 * at every level, so pop can function properly.
 */


public class MinimumStack {

    private Stack<Integer> stack;
    private Stack<Integer> minimumStack;


    public MinimumStack() {
        this.stack = new Stack<Integer>();
        this.minimumStack = new Stack<Integer>();
    }

    public void push(Integer value) {
        this.stack.add(value);
        if (this.minimumStack.empty()) {
            this.minimumStack.add(value);
        } else {
            this.minimumStack.add(Math.min(value, this.minimumStack.peek()));
        }
    }

    public Integer pop() {
        this.minimumStack.pop();
        return this.stack.pop();
    }

    public Integer top() {
        return this.stack.peek();
    }

    public Integer getMin() {
        return this.minimumStack.peek();
    }


    public static void main(String[] args) {
        MinimumStack min = new MinimumStack();
        min.push(10);
        min.push(20);
        min.push(30);
        min.push(40);
        min.push(5);
        System.out.println("Minimum: " + min.getMin());
        min.pop();
        System.out.println("Minimum: " + min.getMin());

    }
    
}
