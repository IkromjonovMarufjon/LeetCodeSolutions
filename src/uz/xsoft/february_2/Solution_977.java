package uz.xsoft.february_2;

public class Solution_977 {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int l = 0, r = nums.length-1, index = 0;
        while (l < r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                result[index ++] =  nums[l] * nums[l];
                l ++;
            } else {
                result[index ++] =  nums[r] * nums[r];
                r --;
            }
        }
        return result;
    }
}
