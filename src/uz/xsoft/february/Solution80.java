package uz.xsoft.february;

import java.util.Arrays;

// start 12 : 43
public class Solution80 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count < 2 || num > nums[count -2])
                nums[count ++] = num;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(arr));
    }
}
