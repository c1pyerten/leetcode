public class IslandPerimeter463 {
    public int solution(int[][] grid) {
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        // define four direction
                        int m = dir[k][0] + i;
                        int n = dir[k][1] + j;
                        if (m < 0 || n < 0 || m >= grid.length || n >= grid[i].length || grid[m][n] ==0) {
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    public int solution2(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i > 0 && grid[i-1][j] == 1) {
                        result -= 2;
                    }
                    if (j > 0 && grid[i][j-1] == 1) {
                        result -= 2;
                    }
                }
            }
        }

        return result;
    }
}
