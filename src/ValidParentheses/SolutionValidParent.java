package ValidParentheses;

import java.util.Stack;

public class SolutionValidParent {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if (c == ')' && ch != '(') {
                    return false;
                } else if (c == '}' && ch != '{') {
                    return false;
                } else if (c == ']' && ch != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}













































//Stack<Character> stack = new Stack<>();
//        for (char ch : s.toCharArray()) {
//        if (ch == '(' || ch == '[' || ch == '{') {
//        stack.push(ch);
//            } else {
//                    if (stack.isEmpty()) {
//        return false;
//        }
//char top = stack.pop();
//                if (ch == ')' && top != '(') {
//        return false;
//        }
//        if (ch == ']' && top != '[') {
//        return false;
//        }
//        if (ch == '}' && top != '{') {
//        return false;
//        }
//        }
//        }
//        return stack.isEmpty();