package uz.xsoft.february;

import java.util.Arrays;

public class Solution977 {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int powLeft = 0, powRight = 0, index = nums.length -1;
        while (left < right) {
            powLeft = nums[left] * nums[left];
            powRight = nums[right] * nums[right];
            if (powLeft >= powRight) {
                result[index--] = powLeft;
                left ++;
            } else {
                result[index--] = powRight;
                right --;
            }
            System.out.println(Arrays.toString(result));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,0,3,5,9};
        sortedSquares(nums);
    }
}
