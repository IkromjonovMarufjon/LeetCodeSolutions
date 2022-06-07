package uz.xsoft.february_2;

public class Solution_1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            if (s == sum - s - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
