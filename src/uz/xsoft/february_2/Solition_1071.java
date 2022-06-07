package uz.xsoft.february_2;

public class Solition_1071 {
    public static void main(String[] args) {
        System.out.println(GCD(5, 6));
        System.out.println(GCD(8, 6));
        System.out.println(GCD(12, 6));
    }

    private static int GCD(int a, int b) {
        if (b == 0) return a;
        return a % b == 0 ? b : GCD(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int l1 = str1.length();
        int l2 = str2.length();
        int gcd = GCD(l1, l2);
        System.out.println(gcd);
        return str1.substring(0,gcd);
    }
}
