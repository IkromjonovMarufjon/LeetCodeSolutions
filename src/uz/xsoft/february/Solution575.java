package uz.xsoft.february;

public class Solution575 {
    public int distributeCandies(int[] candyType) {
        int offset =10_000;
        int length = offset *2 +1;
        boolean[] bool = new boolean[length];

        int count = 0;
        for (int i = 0; i < candyType.length && count < candyType.length >> 1; i++) {
            if (!bool[candyType[i] + offset]) {
                count ++;
                bool[candyType[i] + offset] = true;
            }
        }
        return count;
    }
}
