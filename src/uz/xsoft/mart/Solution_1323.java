package uz.xsoft.mart;

public class Solution_1323 {
    public int maximum69Number (int num) {
        String st = Integer.toString(num);
        int index = st.indexOf('6');
        if (index > -1) {
            st = st.replaceFirst("6","9");
        }
        return Integer.parseInt(st);
    }
}
