import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) return false;
                Character cc = stack.pop();
                if (!((s.charAt(i) == ')' && cc == '(') || (s.charAt(i) == '}' && cc == '{') || (s.charAt(i) == ']' && cc == '['))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()"));
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("(]"));
        System.out.println(new ValidParentheses().isValid("]"));
    }
}
