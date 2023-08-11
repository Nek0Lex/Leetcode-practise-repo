//https://leetcode.com/problems/min-stack/

class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> stackTemp;

    public MinStack() {
        stack = new Stack<Integer>();
        stackTemp= new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (stackTemp.isEmpty() || val <= stackTemp.peek()) stackTemp.push(val);
    }
    
    public void pop() {
        int popVal = stack.pop();
        if(!stackTemp.isEmpty() && stackTemp.peek() == popVal) stackTemp.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackTemp.isEmpty() ? 0 : stackTemp.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */