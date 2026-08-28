class MinStack {
    private Node top;

    class Node {
        int value;
        Node next;
        Node min;

        Node(int value){
            this.value = value;
            this.next = null;
            this.min = null;
        }
    }

    public MinStack() {
        this.top = null;
    }
    
    public void push(int val) {
        var newNode = new Node(val);
        if(this.top == null){
            this.top = newNode;
            newNode.min = newNode;
            return;
        }
        newNode.next = this.top;
        var currentMin = this.top.min;

        this.top = newNode;

        if(currentMin.value > newNode.value){
            newNode.min = newNode;
        }else{
            newNode.min = currentMin;
        }
    }
    
    public void pop() {
       if(this.top == null){
        return;
       }

       var tmp = this.top;
       this.top = this.top.next;
       tmp.next = null;
    
    }
    
    public int top() {
        return this.top.value;
    }
    
    public int getMin() {
        return this.top.min.value;
    }
}
