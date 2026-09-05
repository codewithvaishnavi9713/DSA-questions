package Stacks;

import java.util.Stack;

public class baseballgame {

    public static void main(String[] arr) {
        String[] strings = new String[]{"5", "2", "C", "D", "+"};
        int n = strings.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            String s = strings[i];

            if (s.equals("C")) {
                stack.pop();
            }

            else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            }

            else if (s.equals("+")) {

                int top = stack.pop();
                int second = stack.peek();

                int sum = top + second;

                stack.push(top);
                stack.push(sum);
            }

            else {
                stack.push(Integer.parseInt(s));
            }
        }

        int sum = 0;

        while (stack.size() > 0) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}