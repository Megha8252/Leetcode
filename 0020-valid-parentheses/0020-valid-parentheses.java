class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets into stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack empty or mismatch -> invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty, valid; else invalid
        return stack.isEmpty();
    }
}
