package uz.xsoft.mart;

public class Solution_1837 {
    public int sumBase(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 10);
            n /= 10;
        }
        System.out.println(sb.reverse().toString());
        int i = Integer.getInteger(sb.reverse().toString(),k);
        System.out.println(i);
        int sum = 0;
        while (i > 10) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
