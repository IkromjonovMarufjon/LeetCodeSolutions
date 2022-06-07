package uz.xsoft.mart;

public class Solution_482 {
    public String licenseKeyFormatting(String s, int k) {
        s = new StringBuilder(s).reverse().toString();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char element : s.toCharArray()) {
            if (element == '-') continue;
            if (count == k) {
                sb.append("-");
                count = 0;
            }
            if (element >= 'a') {
                element = Character.toUpperCase(element);
            }
            sb.append(element);
            count++;
        }
        return sb.reverse().toString();
    }
}
