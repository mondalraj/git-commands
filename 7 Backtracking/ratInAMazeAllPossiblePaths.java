import java.util.Arrays;

public class ratInAMazeAllPossiblePaths {
    public static void rat_in_maze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        printAllPaths(maze, 0, 0, path);
    }

    public static void printAllPaths(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;

        // base case
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        path[i][j] = 1;

        // destination cell
        if (i == n - 1 && j == n - 1) {
            // printing path
            for (int row = 0; row < n; row++) {
                System.out.println(Arrays.toString(path[row]));
            }
            System.out.println();
            path[i][j]=0;
            return;
        }

        // top
        printAllPaths(maze, i - 1, j, path);

        // right
        printAllPaths(maze, i, j + 1, path);

        // down
        printAllPaths(maze, i + 1, j, path);

        // left
        printAllPaths(maze, i, j - 1, path);

        path[i][j]=0;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
        rat_in_maze(maze);
    }
}
