class MyQueue {
    Stack<Integer> que;
    public MyQueue() {
        que= new Stack<>();
    }
    public void push(int x) {
        que.push(x);
    }
    public int pop() {
        return que.remove(0);
    }
    public int peek() {
        return que.firstElement();
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */