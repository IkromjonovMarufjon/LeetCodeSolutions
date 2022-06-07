package uz.xsoft.mart;

public class Solution_1417 {
    public String reformat(String s) {
        StringBuilder numeric = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) numeric.append(ch);
            else letters.append(ch);
        }
        if (Math.abs(letters.length() - numeric.length()) > 1 ) return "";
        StringBuilder result = new StringBuilder(letters.length() * 2);
        if (numeric.length() > letters.length()) {
            result.append(numeric.charAt(0));
            for (int i = 0; i < letters.length(); i++) {
                result.append(letters.charAt(i)).append(numeric.charAt(i+1));
            }
        }
        if (numeric.length() < letters.length()) {
            result.append(letters.charAt(0));
            for (int i = 0; i < numeric.length(); i++) {
                result.append(numeric.charAt(i)).append(letters.charAt(i+1));
            }
        }
        if (numeric.length() == letters.length()) {
            for (int i = 0; i < numeric.length(); i++) {
                result.append(numeric.charAt(i)).append(letters.charAt(i));
            }
        }
        return result.toString();
    }
}
