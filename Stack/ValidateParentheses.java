package Stack;

import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        Stack<Character> pStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    pStack.push(ch);
                    break;

                case ')':
                    if (pStack.isEmpty() || pStack.pop() != '(')
                        return false;
                    break;

                case '}':
                    if (pStack.isEmpty() || pStack.pop() != '{')
                        return false;
                    break;

                case ']':
                    if (pStack.isEmpty() || pStack.pop() != '[')
                        return false;
                    break;

                default:
                    return false;
            }
        }
        return pStack.isEmpty();
    }
}
