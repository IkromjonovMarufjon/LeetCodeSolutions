package uz.xsoft.may;

public class Solution1720 {
    public static void main(String[] args) {
        System.out.println(10 ^ 56);
        System.out.println(10 ^ 50);
        System.out.println(56 ^ 50);
    }

    public int[] decode(int[] encoded, int first) {
        int[] original = new int[encoded.length+1];
        original[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            original[i+1] = encoded[i] ^ original[i];
        }
        return original;
    }
}
