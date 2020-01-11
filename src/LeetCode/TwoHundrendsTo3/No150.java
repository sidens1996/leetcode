package LeetCode.TwoHundrendsTo3;

import java.util.Stack;

/**
 * @ClassName: No150
 * @Description: leetcode第150题，Evaluate Reverse Polish Notation
 * @Author: Achilles
 * @Date: 11/01/2020  16:57
 * @Version: 1.0
 **/

public class No150 {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if (token.equals("+")) result = a + b;
                else if (token.equals("-")) result = a - b;
                else if (token.equals("*")) result = a * b;
                else result = a / b;
                stack.push(String.valueOf(result));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        System.out.println(new No150().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}