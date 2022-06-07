package uz.xsoft.february;

public class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        int l= 0, r = nums.length, m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] == target) return m;
            else if (nums[m] > target) r = m-1;
            else l = m +1;
        }
        return l;
    }
}
