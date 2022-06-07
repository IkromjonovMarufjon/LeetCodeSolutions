package uz.xsoft.february;

import java.util.Arrays;

public class Contest_6000 {
    public static int[] sortEvenOdd(int[] nums) {
        if (nums.length < 3) return nums;
        int[] n_1 = new int[nums.length / 2];
        int[] n_2 = new int[nums.length / 2 + nums.length % 2];
        int index_1 = 0, index_2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) n_2[index_2++] = nums[i];
            else n_1[index_1++] = nums[i];
        }
        Arrays.sort(n_1);
        Arrays.sort(n_2);
        int x_1 = n_1.length;
        int x_2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) nums[i] = n_2[x_2++];
            else nums[i] = n_1[--x_1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3};
        int[] result = sortEvenOdd(arr);
        System.out.println(Arrays.toString(result));
    }
}
