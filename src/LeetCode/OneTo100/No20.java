package LeetCode.OneTo100;

import java.util.Stack;

/**
 * @ClassName: No20
 * @Description: leetcode第20题 valid parentheses
 * @Author: Achilles
 * @Date: 01/01/2020  18:26
 * @Version: 1.0
 **/

public class No20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String left = "([{";
        String right = ")]}";
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.size() != 0 && !left.contains(stack.peek().toString())) {
                        return false;
                    } else if (stack.size() != 0 && stack.peek() == left.charAt(right.indexOf(s.charAt(i)))) {
                        stack.pop();
                    }else {
                        stack.push(s.charAt(i));
                    }
                    break;
            }
        }
        if (stack.size() == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(new No20().isValid(s));
    }
}
