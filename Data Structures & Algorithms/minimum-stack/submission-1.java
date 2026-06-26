class MinStack {

    int size = 10;
    int head = 0;
    int min = Integer.MAX_VALUE;

    int[] stack;

    public MinStack() {
        stack = new int[size];
    }
    
    public void push(int val) {
        stack[head] = val;
        if (val < min){
            min = val;
        }
        head++;
        if (head == stack.length - 1){
            resizeStack();
        }
        
    }
    
    public void pop() {
        head--;
        int val = stack[head];
        if (min == stack[head]){
            calculateMin();
        }
        
    }
    
    public int top() {
        return stack[head-1];
    }
    
    public int getMin() {
        return min;
    }

    private void calculateMin(){
        int tempMin = Integer.MAX_VALUE;
        for (int i = 0; i < head; i++){
            if (stack[i] < tempMin){
                tempMin = stack[i];
            }
        }
        min = tempMin;
    }

    private void resizeStack(){
        size = size*2;
        int[] arr = new int[size];
        System.arraycopy(stack, 0, arr, 0, head);
        stack = arr;
    }
}
