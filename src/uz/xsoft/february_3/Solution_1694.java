package uz.xsoft.february_3;

public class Solution_1694 {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                sb.append(number.charAt(i));
                if (++ count % 3 == 0) sb.append('-');
            }
        }
        if (sb.charAt(sb.length() -1) == '-') sb.deleteCharAt(sb.length()-1);
        if (sb.charAt(sb.length() - 2) == '-') {
            sb.setCharAt(sb.length() -2, sb.charAt(sb.length() - 3));
            sb.setCharAt(sb.length() -3, '-');
        }
        return sb.toString();
    }
}
