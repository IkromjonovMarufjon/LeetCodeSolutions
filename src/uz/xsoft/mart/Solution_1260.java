package uz.xsoft.mart;

import java.util.ArrayList;
import java.util.List;

public class Solution_1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int length = grid.length * grid[0].length;
        k = k % length;
        List<List<Integer>> result = new ArrayList<>();
        if (length == 1) {
            List<Integer> t = new ArrayList<>();
            t.add(grid[0][0]);
            result.add(t);
            return result;
        }
        int[] temp = new int[length];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                temp[index++] = grid[i][j];
            }
        }
        int[] t = new int[temp.length];
        index = 0;
        for (int i = temp.length - k; i < temp.length; i++) {
            t[index++] = temp[i];
        }
        for (int i = 0; i < temp.length - k; i++) {
            t[index++] = temp[i];
        }

        index = 0;

        for (int i = 0; i < grid.length; i++) {
            List<Integer> x = new ArrayList<>(grid[i].length);
            for (int j = 0; j < grid[i].length; j++) {
                x.add(t[index++]);
            }
            result.add(x);
        }
        return result;
    }
}
