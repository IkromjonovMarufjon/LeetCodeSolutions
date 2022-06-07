package uz.xsoft.february;

public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        // s1 = "ab", s2 = "eidbaooo"
        if (s2.length() == 0) return true;
        if (s1.length() > s2.length()) return false;
        int index = 0;
        StringBuilder sb = new StringBuilder(s1);
        for (int i = 0; i < s2.length(); i++) {
            index = indexOf(sb,s2.charAt(i));
            if (index >= 0) {
                sb.deleteCharAt(index);
                if (sb.length() == 0) return true;
            } else sb = new StringBuilder(s1);
        }
        return sb.length() == 0;
    }

    private int indexOf(StringBuilder sb, char ch) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) return i;
        }
        return -1;
    }

}
