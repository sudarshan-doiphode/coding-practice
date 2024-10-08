package exercise.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "{}(){()}[]";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') {
                stack.push(charArray[i]);
            }
            if (!stack.isEmpty()) {
                Character peek = stack.peek();
                if (charArray[i] == ')' && peek == '(') {
                    stack.pop();
                }
                if (charArray[i] == '}' && peek == '{') {
                    stack.pop();
                }
                if (charArray[i] == ']' && peek == '[') {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
