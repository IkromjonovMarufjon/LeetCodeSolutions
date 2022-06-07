package uz.xsoft.february_2;

public class Solution_824 {
    public String toGoatLatin(String sentence) {
        String[] mass = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        return "";
    }

    private boolean isVowel(char ch) {
        if (ch >= 'a') return ch == 'o' || ch == 'i' || ch == 'a' || ch == 'e' || ch == 'u';
        else return ch == 'O' || ch == 'I' || ch == 'A' || ch == 'E' || ch == 'U';
    }


}
