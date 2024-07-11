

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == ')') {
                StringBuilder temp = new StringBuilder();
                
                while (!stack.isEmpty() && stack.peek() != '(') {
                    temp.append(stack.pop());
                }
                
                // Remove the '(' from the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                
                // Push the reversed characters back onto the stack
                for (int k = 0; k < temp.length(); k++) {
                    stack.push(temp.charAt(k));
                }
                
            } else {
                stack.push(currentChar);
            }
        }
        
        // Construct the result from the stack
        StringBuilder result = new StringBuilder();
        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        // Reverse the result to get the final answer
        return result.reverse().toString();
    }
}
