package uz.xsoft.november;

import java.util.Arrays;

public class Solution2090 {

    public int[] getAverages(int[] nums, int k) {
        if (k == 0) return nums;
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        int denominator = 2*k+1;
        if (nums.length < denominator) return result;
        
        long summ = 0;
        for (int i = 0; i <= 2*k; i++) {
            summ += nums[i];
        }


        result[k] = (int) (summ/denominator);
        for (int i = k+1; i < nums.length-k; i++) {
            summ += nums[i+k] - nums[i-k-1];
            result[i] = (int) (summ / denominator);
        }
        return result;
    }
}
