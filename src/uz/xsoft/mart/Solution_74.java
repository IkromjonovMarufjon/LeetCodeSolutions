package uz.xsoft.mart;

public class Solution_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int end = n * m;
        int start = 0;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;
            int t = matrix[middle/m][middle%n];
            if (t == target) return true;
            if (t < target) start = middle + 1;
            else end = middle -1;
        }
        return false;
    }
}
