package uz.xsoft.mart;

import java.util.Stack;

public class Solution_71 {
    public static void main(String[] args) {

    }

    public static String simplifyPath(String path) {
        Stack<Character> stack = new Stack<>();
        int zeroCount = 0;
        int slashPos = 0;
        stack.push('/');
        for (int i = 1; i < path.length(); i++) {
            if (path.charAt(i) == '.') {
                zeroCount ++;
                stack.push('.');
                continue;
            }
            if (Character.isLetter(path.charAt(i)) || path.charAt(i) == '_') {
                stack.push(path.charAt(i));
                continue;
            }
            if (path.charAt(i) == '/' && stack.peek() != '/') {
                if (stack.size() - slashPos == zeroCount) {
                    if (zeroCount == 2) {
                        while (stack.peek() != '/') {
                            stack.pop();
                        }
                        continue;
                    }
                }
                slashPos = stack.size();
                stack.push('/');
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        if (sb.charAt(sb.length() -1) == '/') {
            sb.deleteCharAt(sb.length() -1);
        }
        return sb.toString();
    }
}


