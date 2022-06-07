package uz.xsoft.february_2;

import java.util.Stack;

public class Solution_402 {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            System.out.println(stack);
            if (k <= 0) {
                stack.add(num.charAt(i));
                continue;
            }
            if (num.charAt(i) == '0') {
                if (stack.size() >= k) {
                    k -= stack.size();
                    stack.clear();
                } else {
                    while (k > 0) {
                        stack.pop();
                        k --;
                    }
                }
                if (k == 0) stack.add('0');
                continue;
            }
            if (stack.isEmpty()) {
                stack.add(num.charAt(i));
                continue;
            }
            if (stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
                i --;
                continue;
            }
            stack.add(num.charAt(i));
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k --;
        }
        while (!stack.isEmpty() && stack.get(0) == '0')
            stack.remove(0);
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return sb.toString().length() == 0 ? "0" :sb.toString();
    }
}
