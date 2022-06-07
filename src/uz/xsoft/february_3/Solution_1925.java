package uz.xsoft.february_3;

public class Solution_1925 {
    public int countTriples(int n) {
        int amount = 0, remember = 0, count = 0;
        for (int i = 1; i < n; i++) {
            amount = i*i;
            for (int j = i; j < n; j++) {
                remember = isSquare(amount + j*j);
                if (remember > -1 && remember <= n) {
                    System.out.println();
                    count += 2;
                }
            }
        }
        return count;
    }

    private int isSquare(int n) {
        int p = (int) Math.sqrt(n);
        return p*p == n ? p : -1;
    }
}
