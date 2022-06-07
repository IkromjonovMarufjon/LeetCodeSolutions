package uz.xsoft.february_3;

public class Solution_2047 {
    public static void main(String[] args) {
       // System.out.println("Result  -> " + countValidWords("!this  1-s b8d!"));
        System.out.println(havePunctuation("!this"));
    }

    public static int countValidWords(String sentence) {
        String[] arr = sentence.split(" ");
        int count = 0;
        for (String value : arr) {
            System.out.println("value -> " + value);
            if (value.length() == 0) continue;
            System.out.println("step -> " + 1);
            if (!haveDigit(value)) continue;
            System.out.println("step -> " + 2);
            if (!haveDefis(value)) continue;
            System.out.println("step -> " + 3);
            if (!havePunctuation(value)) continue;
            System.out.println("step -> " + 4);
            count++;
        }
        return count;
    }

    private static boolean haveDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && !Character.isLowerCase(s.charAt(i))) return false;
        }
        return true;
    }

    private static boolean haveDefis(String s) {
        return s.indexOf("-") == s.lastIndexOf("-")
                && s.charAt(0) != ' '
                && s.charAt(s.length() - 1) != ' ';
    }

    private static boolean havePunctuation(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',') return false;
        }
        return Character.isLetter(s.charAt(0));
    }
}
