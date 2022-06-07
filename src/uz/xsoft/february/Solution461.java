package uz.xsoft.february;

public class Solution461 {
    public static int hammingDistance(int x, int y) {
        String XBinary = Integer.toBinaryString(x);
        String YBinary = Integer.toBinaryString(y);
        int min = Math.min(YBinary.length(), XBinary.length());
        int count = 0;
        for (int i = 0; i < min; i++) {
            if ((YBinary.charAt(i) == '1' && XBinary.charAt(i) == '0')
                    || (XBinary.charAt(i) == '1' && YBinary.charAt(i) == '0')){
                count ++;
            }
        }

        if (min < XBinary.length()) {
            for (int i = min; i < XBinary.length(); i++) {
                if (XBinary.charAt(i) == '1') count ++;
            }
        }
        if (min < YBinary.length()) {
            for (int i = min; i < YBinary.length(); i++) {
                if (YBinary.charAt(i) == '1') count ++;
            }
        }
        return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(18^2));
        System.out.println(Integer.toBinaryString(4^1));
        System.out.println(Integer.toBinaryString(6^2));
        System.out.println(Integer.toBinaryString(18^1));
    }
}
