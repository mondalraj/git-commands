// https://codeforces.com/problemset/problem/233/A

import java.util.*;
public class perfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 1){
            System.out.println("-1");
            System.exit(0);
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] = i+2;
            } else {
                arr[i] = i;
            }
        }
        for(int i =0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}