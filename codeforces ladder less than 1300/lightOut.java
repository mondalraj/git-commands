// https://codeforces.com/problemset/problem/275/A

import java.util.*;

public class lightOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] init = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (arr[i][j] % 2 != 0) {
                    init[i][j] = 0;

                    if (i != 2) {
                        if (init[i + 1][j] == 1) {
                            init[i + 1][j] = 0;
                        } else {
                            init[i + 1][j] = 1;
                        }
                    }
                    if (i != 0) {
                        if (init[i - 1][j] == 1) {
                            init[i - 1][j] = 0;
                        } else {
                            init[i - 1][j] = 1;
                        }
                    }
                    if (j != 0) {
                        if (init[i][j - 1] == 1) {
                            init[i][j - 1] = 0;
                        } else {
                            init[i][j - 1] = 1;
                        }
                    }
                    if (j != 2) {
                        if (init[i][j + 1] == 1) {
                            init[i][j + 1] = 0;
                        } else {
                            init[i][j + 1] = 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(init[i][j]);
            }
            System.out.println("");
        }
    }
}