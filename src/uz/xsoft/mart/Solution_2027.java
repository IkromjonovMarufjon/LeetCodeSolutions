package uz.xsoft.mart;

public class Solution_2027 {
    public int minimumMoves(String s) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') count ++;
            else {
                sum += count / 3 + count %3 == 0 ? 0 : 1;
                count = 0;
            }
        }
        sum += count / 3 + count %3 == 0 ? 0 : 1;
        return sum;
    }
}
