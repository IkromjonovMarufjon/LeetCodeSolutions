package uz.xsoft.mart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sumAll = 0;
        for (int num : nums) {
            sumAll += num;
        }
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            sum += nums[i];
            sumAll -= nums[i];
            if (sum > sumAll) return list;
        }
        return list;
    }
}
