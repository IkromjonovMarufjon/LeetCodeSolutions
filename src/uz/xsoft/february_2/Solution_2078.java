package uz.xsoft.february_2;

public class Solution_2078 {
    public int maxDistance(int[] colors) {
        int size =colors.length - 1;
        for (int i = colors.length -1; i > 0 ; i--) {
            if (colors[i] == colors[0]) size --;
            else i = 0;
        }
        int _s = colors.length -1;
        for (int i = 0; i < colors.length; i ++) {
            if (colors[i] == colors[colors.length -1]) _s --;
            else i = colors.length;
        }
        return Math.min(_s, size);
    }
}
