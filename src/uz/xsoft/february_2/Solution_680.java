package uz.xsoft.february_2;

public class Solution_680 {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
                continue;
            }
            return isPolindrom(s.substring(start+1,end))
                    || isPolindrom(s.substring(start,end-1));
        }
        return true;
    }

    private boolean isPolindrom(String s) {
        int l = 0, r = s.length();
        while (l < r) {
            if (s.charAt(l++) != s.charAt(--r))
                return false;
        }
        return true;
    }
}

//"ececabbacec"