package uz.xsoft.february_3;

public class Solution_1716 {
    public int totalMoney(int n) {
        int fullWeekCount = n / 7;
        int sum = 28*fullWeekCount  + 7*(fullWeekCount -1)*fullWeekCount/2;

        int amount = fullWeekCount;
        for (int i = fullWeekCount*7; i < n; i++) {
            sum += amount;
            amount ++;
        }
        return sum;
    }
}
