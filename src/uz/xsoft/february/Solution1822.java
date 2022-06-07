package uz.xsoft.february;

public class Solution1822 {
    public int arraySign(int[] nums) {
        int countNegatives = 0;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) countNegatives++;
        }
        return countNegatives / 2 == 1 ? -1 : 1;
    }
}
