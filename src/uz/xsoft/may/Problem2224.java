package uz.xsoft.may;

public class Problem2224 {
    public int convertTime(String current, String correct) {
        if (correct.equals(current)) return 0;
        int diff = 0;
        if (current.substring(0,2).equals(correct.substring(0,2))) {
            diff = toInt(correct.substring(2,5)) - toInt(current.substring(2,5));
        } else {
            diff += toInt(correct.substring(2,5));
            diff += 60 - toInt(current.substring(2,5));
            diff += 60* (toInt(correct.substring(0,2)) - toInt(current.substring(0,2))-1);
        }

        System.out.println(diff);
        int count = 0;
        count += diff / 60;
        diff %= 60;

        count += diff / 15;
        diff %= 15;

        count += diff / 5;
        diff %= 5;
        return count + diff;
    }

    private int toInt(String s) {
        int amount = 0;
        for (int i = 0; i < s.length() ; i++) {
            amount = amount * 10 + (s.charAt(i) - '0' );
        }
        return amount;
    }
}
