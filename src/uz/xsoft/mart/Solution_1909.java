package uz.xsoft.mart;

public class Solution_1909 {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                count ++;
                if (count > 1) return false;
                nums[i-1] = nums[i-2];
                i--;
            }
        }
        return true;
    }
}
