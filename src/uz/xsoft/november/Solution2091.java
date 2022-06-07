package uz.xsoft.november;

import static sun.swing.MenuItemLayoutHelper.max;

public class Solution2091 {
    public int minimumDeletions(int[] nums) {
        if (nums.length == 1) return 1;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) maxIndex = i;
            if (nums[minIndex] > nums[i]) minIndex = i;
        }

        if (maxIndex < minIndex) {
            int change = minIndex;
            minIndex = maxIndex;
            maxIndex = change;
        }

        int result = nums.length;
        System.out.println("1 - " + result);
        if (result > maxIndex) result = maxIndex;

        System.out.println("2 - " + result);
        if (result > nums.length - minIndex) result = nums.length - minIndex;
        System.out.println("3 - " + result);
        if (result > minIndex + nums.length - maxIndex) result = minIndex + nums.length - maxIndex;
        System.out.println("4 - " + result);
        return result;

    }
}
