package uz.xsoft.january;

public class Leetcode2154 {
    public int findFinalValue(int[] nums, int original) {
        boolean bool = false;
        while (contains(nums, original * 2) >    -1) {
            original *= 2;
            bool = true;
        }
        System.out.println(bool);
        return bool? original * 2:original ;
    }

    private int contains(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
