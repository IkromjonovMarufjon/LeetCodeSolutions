package uz.xsoft.february_3;

public class Solution_1672 {
    public int maximumWealth(int[][] accounts) {
        int sum = 0, max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) max = sum;
            sum = 0;
        }
        return max;
    }
}
