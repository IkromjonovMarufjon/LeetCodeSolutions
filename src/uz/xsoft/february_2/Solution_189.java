package uz.xsoft.february_2;

import java.util.Arrays;

public class Solution_189 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotate(mass, 2);
    }

    public static void rotate(int[] nums, int k) {
        int[] mass = new int[k];
        for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
            mass[j] = nums[i];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        System.out.println(Arrays.toString(nums));
        for (int i = k - 1; i >= 0; i--) {
            nums[i] = mass[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
