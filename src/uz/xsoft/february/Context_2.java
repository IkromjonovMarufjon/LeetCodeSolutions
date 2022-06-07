package uz.xsoft.february;

public class Context_2 {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int pos_1 = 0, pos_2 = 0;
        for (int num : nums) {
            if (num < pivot) pos_1++;
            if (num == pivot) pos_2++;
        }
        int x = 0;
        int y = pos_1;
        int z = pos_1 + pos_2;

        for (int num : nums) {
            if (num < pivot) result[x++] = num;
            if (num == pivot) result[y++] = num;
            if (num > pivot) result[z++] = num;
        }
        return result;
    }
}
