// https://codeforces.com/problemset/problem/263/A

import java.util.*;

public class beautifulMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int count = 0;
        int rowOne=0, colOne=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    rowOne = i;
                    colOne = j;
                }
            }
        }
        while(rowOne != 2 || colOne != 2){
            if(rowOne > 2){
                int rowSwap = rowOne - 2;
                count = count + (rowSwap);
                rowOne = 2;
            }
            if(rowOne < 2){
                int rowSwap = 2 - rowOne;
                count = count + (rowSwap);
                rowOne = 2;
            }
            if(colOne > 2){
                int colSwap = colOne - 2;
                count = count + (colSwap);
                colOne = 2;
            }
            if(colOne < 2){
                int colSwap = 2 - colOne;
                count = count + (colSwap);
                colOne = 2;
            }
        }

        System.out.println(count);

    }
}
