package uz.xsoft.february;

public class Solution1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum_1 = 0, sum_2 = 0;
        if (start > destination) {
            for (int i = 0; i < distance.length; i++) {
                if (destination < i && i <=start) {
                    sum_2 += distance[i];
                } else sum_1 += distance[i];
            }
        } else {
            for (int i = 0; i < distance.length; i++) {
                if (start <= i && i < destination) {
                    sum_2 += distance[i];
                } else sum_1 += distance[i];
            }
        }
        return Math.min(sum_1, sum_2);
    }
}

