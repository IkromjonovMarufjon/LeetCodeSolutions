package uz.xsoft.february;

public class Solution_171 {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26 + (columnTitle.charAt(i) - 'A'+1);
        }
        return sum;
    }
}
