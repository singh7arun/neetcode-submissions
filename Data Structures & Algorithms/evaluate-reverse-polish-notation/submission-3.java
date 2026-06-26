class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for (int i =0; i < tokens.length; i ++){
           switch (tokens[i]) {
                case "+": 
                    res = stack.pop();
                    res = stack.pop() + res;
                    stack.push(res);
                    break;
                case "-":
                    res = stack.pop();
                    res = stack.pop() - res;
                    stack.push(res);
                    break;
                case "*":
                    res = stack.pop();
                    res = stack.pop() * res;
                    stack.push(res);
                    
                    break;
                case "/":
                    res = stack.pop();
                    res = stack.pop() / res;
                    stack.push(res);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));

            }
        }
        return stack.pop();
    }
}
