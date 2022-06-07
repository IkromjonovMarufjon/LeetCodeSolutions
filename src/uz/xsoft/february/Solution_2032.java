package uz.xsoft.february;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2032 {
    public static void main(String[] args) {
//        System.out.println(1 | 1);

        int[] count = new int[10];
        System.out.println(Arrays.toString(count));

        int[] nums = {1, 1, 2, 1, 1, 1, 1, 1, 2, 9};
        for (int i : nums) count[i] |= 1;
        System.out.println(Arrays.toString(count));

        int[] nums2 = {1, 1, 2, 1, 5, 5, 5, 6, 3, 6};
        for (int i : nums2) count[i] |= 2;
        System.out.println(Arrays.toString(count));
//        int result = 17;
//        result |= 1;
//        System.out.println(result);
//        result |= 1<<1;  // 2
//        System.out.println(result);
//        result |= 1<<2;  // 4
//        System.out.println(result);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr = new int[101];
        for (int i : nums1) arr[i] |= 1;
        for (int i : nums2) arr[i] |= 2;
        for (int i : nums3) arr[i] |= 4;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (arr[i] == 3 || arr[i] == 5 || arr[i] == 6 || arr[i] == 7) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
