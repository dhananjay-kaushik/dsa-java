import java.util.Stack;

/*
 * Stack is LIFO structure (Last In First Out)
 * Gettig maximum of stack is O(n) operation hard-coded. To get the maximum
 * in O(1) we need to manage a separate stack which keep record of maximum
 * at every level, so pop can function properly.
 */


public class MaximumStack {

    private Stack<Integer> stack;
    private Stack<Integer> maximumStack;


    public MaximumStack() {
        this.stack = new Stack<Integer>();
        this.maximumStack = new Stack<Integer>();
    }

    public void push(Integer value) {
        this.stack.add(value);
        if (this.maximumStack.empty()) {
            this.maximumStack.add(value);
        } else {
            this.maximumStack.add(Math.max(value, this.maximumStack.peek()));
        }
    }

    public Integer pop() {
        this.maximumStack.pop();
        return this.stack.pop();
    }

    public Integer top() {
        return this.stack.peek();
    }

    public Integer getMax() {
        return this.maximumStack.peek();
    }


    public static void main(String[] args) {
        MaximumStack max = new MaximumStack();
        max.push(10);
        max.push(20);
        max.push(30);
        max.push(40);
        max.push(5);
        System.out.println("Maximum: " + max.getMax());
        max.pop();
        max.pop();
        System.out.println("New Maximum: " + max.getMax());

    }
    
}
