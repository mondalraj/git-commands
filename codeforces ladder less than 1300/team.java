// https://codeforces.com/problemset/problem/231/A

import java.util.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
    
        int count = 0;

        for(int i=0;i<n;i++){
            int majorCount = 0;
            if(arr[i][0]==1) majorCount++;
            if(arr[i][1]==1) majorCount++;
            if(arr[i][2]==1) majorCount++;
            if(majorCount>=2) count++;
        }
        System.out.println(count);
    }
}