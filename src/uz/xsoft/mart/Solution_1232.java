package uz.xsoft.mart;

public class Solution_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        return x1 == x2 ? task2(coordinates)
                : task1(x1, y1, x2, y2, coordinates);
    }

    private boolean task2(int[][] coordinates) {
        System.out.println("task2");
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i-1][1] != coordinates[i][1]) return false;
        }
        return true;
    }

    private boolean task1(int x1, int y1, int x2, int y2, int[][] coordinates) {
        System.out.println("task1");
        double k = (y1 - y2) * 1.0 / (x1 - x2);
        double b = (y2 * x1 - y1 * x2) * 1.0 / (x1 - x2);

        System.out.println("k = " + k);
        System.out.println("b = " + b);
        System.out.println("--------");
        for (int i = 2; i < coordinates.length; i++) {
            System.out.println(coordinates[i][1]);
            System.out.println(k*coordinates[i][0] + b);
            System.out.println("------------------------");
            if (coordinates[i][1] != k*coordinates[i][0] + b) return false;
        }
        return true;
    }
}


