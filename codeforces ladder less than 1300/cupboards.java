// https://codeforces.com/problemset/problem/248/A

import java.util.*;
public class cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i<n;i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int left0 = 0;
        int left1 = 0;
        int right0 = 0;
        int right1 = 0;
        int time = 0;
        for(int i = 0; i<n;i++){
            if(arr[i][0] == 0){
                left0++;
            } else{
                left1++;
            }

            if(arr[i][1] == 0){
                right0++;
            } else{
                right1++;
            }
        }
        if(left0>left1){
            time = time+left1;
        } else{
            time = time + left0;
        }

        if(right0>right1){
            time = time+right1;
        } else{
            time = time + right0;
        }
        System.out.println(time);
    }
}
