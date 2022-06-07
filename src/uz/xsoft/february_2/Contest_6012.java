package uz.xsoft.february_2;

public class Contest_6012 {
    public static void main(String[] args) {
        switch ("salom") {
            case "sa" : {

            }

        }
        Object contest_6012 = new Contest_6012();
        if (contest_6012.getClass() == Object.class) {

        }
    }
    public int countEven(int num) {
        return (num / 2 - 1) + getAddAmount(num);
    }

    private int getAddAmount(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }
}
