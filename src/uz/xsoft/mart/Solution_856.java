package uz.xsoft.mart;

import java.util.Stack;

public class Solution_856 {
    public int scoreOfParentheses(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                count += stack.size();
            }
        }
        return count;
    }
}
