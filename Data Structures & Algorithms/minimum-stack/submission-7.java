class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> min; 

    public MinStack() {
        stack = new Stack();
        min = new Stack(); 
    }
    
    public void push(int val) {
        if(min.isEmpty()){
            min.push(val);
        }else{
            if(min.peek() >= val){
                min.push(val);
            }
        }
        stack.push(val);
    }
    
    public void pop() {
        if(!min.isEmpty() && min.peek().equals(stack.peek())){
            min.pop();
        }
         if(!stack.isEmpty()){
            stack.pop();
         }
    }
    
    public int top() {
        return stack.isEmpty() ?  0 :  stack.peek();
    }
    
    public int getMin() {
        return min.isEmpty() ? 0 : min.peek();
    }
}
