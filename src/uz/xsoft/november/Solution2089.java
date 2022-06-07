package uz.xsoft.november;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) count ++;
            if (nums[i] < target) lessCount ++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessCount++);
        }
        return result;
    }

    /*public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) result.add(i);
        }
        return result;
    }*/
}
