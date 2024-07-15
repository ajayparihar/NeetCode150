package Stack;

import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        Stack<Character> subStringStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    subStringStack.push(ch);
                    break;

                case ')':
                    if (subStringStack.isEmpty() || subStringStack.pop() != '(')
                        return false;
                    break;

                case '}':
                    if (subStringStack.isEmpty() || subStringStack.pop() != '{')
                        return false;
                    break;

                case ']':
                    if (subStringStack.isEmpty() || subStringStack.pop() != '[')
                        return false;
                    break;

                default:
                    return false;
            }
        }
        return subStringStack.isEmpty();
    }
}
