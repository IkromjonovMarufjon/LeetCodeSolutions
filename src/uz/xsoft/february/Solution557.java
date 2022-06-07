package uz.xsoft.february;

public class Solution557 {
    //"God Ding"  ->
    public String reverseWords(String s) {
        char[] arr = new char[s.length()];
        int start = 0;
        char ch = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = start,end = i; j < end; j++, end --) {
                    ch = s.charAt(j);
                    arr[end] = s.charAt(start);
                    arr[j] = ch;
                }
                start = i +1;
            }
        }
        int i = s.length()-1;
        for (int j = start,end = i; j < end; j++, end --) {
            ch = s.charAt(j);
            arr[end] = s.charAt(start);
            arr[j] = ch;
        }
        return new String(arr);
    }
}


