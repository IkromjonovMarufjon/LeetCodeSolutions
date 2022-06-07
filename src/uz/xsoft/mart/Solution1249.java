package uz.xsoft.mart;

public class Solution1249 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int parenthesesCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == '(') {
                parenthesesCount ++;
                sb.append('(');
                continue;
            }
            if (parenthesesCount > 0) {
                parenthesesCount --;
                sb.append(')');
            }
        }
        while (parenthesesCount > 0) {
            sb.deleteCharAt(sb.lastIndexOf("("));
            parenthesesCount --;
        }
        return sb.toString();
    }
}
