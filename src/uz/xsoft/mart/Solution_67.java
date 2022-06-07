package uz.xsoft.mart;

public class Solution_67 {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int remember = 0;
        if (b.length() > a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            remember = add(remember, add((a.charAt(i) - '0'), (b.charAt(i) - '0')));
            sb.append(remember % 10);
            remember /= 10;
        }
        for (int i = b.length(); i < a.length(); i++) {
            remember = add(remember, add((a.charAt(i) - '0'), 0));
            sb.append(remember % 10);
            remember /= 10;
        }
        if (remember == 1) sb.append(remember);
        return sb.reverse().toString();
    }

    private int add(int a, int b) {
        System.out.println("(" + a + " : " + b + " )");
        if (a == 1 && b == 1) return 10;
        else return a + b;
    }
}
