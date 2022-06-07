package uz.xsoft.february_3;

import java.util.Arrays;

public class Solution_2022 {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,6,7,8,9,10};
        int[][] nums = construct2DArray(mass, 1, 10);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[0][0];
        int[][] result = new int[m][n];
//        if (m > n) m = n;
        for (int i = 0; i < original.length; i++) {
//            System.out.print(original[i] + " ");
            result[i / n][i % n] = original[i];
        }
        return result;
    }
}
