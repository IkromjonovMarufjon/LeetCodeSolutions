package uz.xsoft.february_2;

public class Solution_557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] mass = s.split(" ");
        for (String sentence : mass) {
            sb.append(new StringBuilder(sentence).reverse()).append(" ");
        }
        return sb.toString().trim();
    }
}
