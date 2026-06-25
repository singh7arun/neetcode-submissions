class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();


        for (int i = 0; i < s.length(); i++){

            switch (s.charAt(i)){
                case '(':
                    stack.offerFirst(s.charAt(i));
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peekFirst() == '('){
                        stack.pollFirst();
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stack.offerFirst(s.charAt(i));
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peekFirst() == '{'){
                        stack.pollFirst();
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack.offerFirst(s.charAt(i));
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peekFirst() == '['){
                        stack.pollFirst();
                    } else {
                        return false;
                    }
                    break;
            }
                


        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
        
    }
}
