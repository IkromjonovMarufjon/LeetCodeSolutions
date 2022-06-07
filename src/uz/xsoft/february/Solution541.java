package uz.xsoft.february;

public class Solution541 {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i+= 2*k) {
            int start = i; int end = Math.min(i + k-1, s.length()-1);
            while (start < end) {
                char ch = chars[start];
                chars[start ++] = chars[end];
                chars[end --] = ch;
                System.out.println(new String(chars));
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}

/*
"abcdefg"
3
* */


