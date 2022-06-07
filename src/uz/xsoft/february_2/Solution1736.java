package uz.xsoft.february_2;

public class Solution1736 {
    public String maximumTime(String time) {   //"2?:?0"
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            time = time.replaceFirst("[?]", "2");
            time = time.replaceFirst("[?]", "3");
        }
        if (time.charAt(0) == '?' && time.charAt(1) != '?'){
           if (time.charAt(1) > '3'){
               time = time.replaceFirst("[?]", "1");
           }else time = time.replaceFirst("[?]", "2");
        }
        if (time.charAt(0) != '?' && time.charAt(1) == '?'){
            if (time.charAt(0) == '2'){
                time = time.replaceFirst("[?]", "3");
            }else time = time.replaceFirst("[?]", "9");
        }
        if (time.charAt(3) == '?' ) {
            time = time.replaceFirst("[?]","5");

        }
        if (time.charAt(4) == '?' ) {
            time = time.replaceFirst("[?]", "9");

        }

        return time;
    }
}
