package Stacks;
import java.util.Stack;

public class pushatbottom {

    static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else {
                if (stack.size() == 0)
                    return false;

                char top = stack.peek();

                if (SameStyle(top, ch)) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }

    static boolean SameStyle(char a, char b) {

        if (a == '(' && b == ')')
            return true;

        if (a == '{' && b == '}')
            return true;

        if (a == '[' && b == ']')
            return true;

        return false;
    }

    public static void main(String[] args) {

        String s = "{[()]}";

        System.out.println(isBalanced(s));
    }
}