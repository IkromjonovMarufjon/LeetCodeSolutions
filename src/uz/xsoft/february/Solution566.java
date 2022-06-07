package uz.xsoft.february;

public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int w = mat.length;
        int h = mat[0].length;
        if (w*h != r*c) return mat;

        int[][] arr = new int[r][c];
        int pos = 0;
        for (int i = 0; i < r*c; i++) {
            arr[pos / i][pos % i] = mat[pos / i][pos % i];
        }
        return arr;
    }
}
