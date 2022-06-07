package uz.xsoft.february;

public class Solution_704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, middle = 0;
        while (left < right) {
            middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle;
                continue;
            }
            if (nums[middle] < target) {
                left = middle;
                continue;
            }
            if (nums[middle] == target) return middle;
        }
        return -1;
    }
}
