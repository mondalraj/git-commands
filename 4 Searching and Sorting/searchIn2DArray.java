import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 }, { 4, 5 }, { 400, 500, 600 } };
        int target = 405;
        //Returning the row and the column
        int[] ans = search_2D_Array(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    static int[] search_2D_Array(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
