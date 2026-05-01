class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (!s.equals("+") &&!s.equals("-") &&!s.equals("*") &&!s.equals("/")) {
                stack.push(Integer.parseInt(s));
            }

            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int res = 0;
                if (s.equals("+")) {
                    res = val2 + val1;
                }
                else if (s.equals("-")) {
                    res = val2 - val1;
                }
                else if (s.equals("*")) {
                    res = val2 * val1;
                }
                else {
                    res = val2 / val1;
                }
                stack.push(res);
            }
        }

        return stack.pop();
    }
}