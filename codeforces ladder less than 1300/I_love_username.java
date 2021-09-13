// https://codeforces.com/problemset/problem/155/A

import java.util.*;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int count = 0;
        for(int i = 0; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
            if(arr[i]<min){
                min = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
