package uz.xsoft.february_2;

public class Solution_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int l = 0, r= numbers.length-1;
        while (l < r && numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] < target) {
                l ++;
            } else r --;
        }
        arr[0] = l;
        arr[1] = r;
        return arr;
    }
}

