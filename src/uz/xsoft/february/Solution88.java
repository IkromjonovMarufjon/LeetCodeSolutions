package uz.xsoft.february;

public class Solution88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int pos1 = m - 1, pos2 = n - 1, index = nums1.length - 1;
        while (pos1 >= 0 && pos2 >= 0) {
            nums1[index--] = nums1[pos1] >= nums2[pos2] ? nums1[pos1--] : nums2[pos2--];
        }
        while (pos1 >= 0) {
            nums1[index--] = nums1[pos1--];
        }
        while (pos2 >= 0) {
            nums1[index--] = nums2[pos2--];
        }
    }

    public static void main(String[] args) {
        int[] num1 = {4, 5, 6, 0, 0, 0, 0};
        int[] num2 = {1, 2, 6, 8};
        merge(num1, 3, num2, 4);
    }
}
