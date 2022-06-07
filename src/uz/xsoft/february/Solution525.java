package uz.xsoft.february;

// Time limit
public class Solution525 {
    public int findMaxLength(int[] nums) {
        int max = 0, countZero = 0, countOne = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) countZero ++;
                else countOne ++;
                if (countOne == countZero) max = Math.max(max,countOne +countZero);
            }
        }
        return max;
    }
}
