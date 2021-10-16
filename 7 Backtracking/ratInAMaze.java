import java.util.Arrays;

public class ratInAMaze {

    public static boolean rat_in_maze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;

        // base case
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        path[i][j] = 1;

        // destination cell
        if (i == n - 1 && j == n - 1) {
            //printing path
            for (int row = 0; row < n; row++) {
                System.out.println(Arrays.toString(path[row]));
            }
            System.out.println();
            return true;
        }

        // top
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        // right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }

        // down
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        // left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
        boolean pathPossible = rat_in_maze(maze);
        System.out.println(pathPossible);
    }
}
