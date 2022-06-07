package uz.xsoft.february_3;

public class Solution_338 {
    public static void main(String[] args) {
        System.out.println(~(-42));
    }
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }
}
