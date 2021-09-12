// https://codeforces.com/problemset/problem/200/B

import java.util.*;
public class drinks{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        double sum=0;

        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i< arr.length; i++){
            sum=sum+arr[i];
        }

        double percent = (double)(sum/n);
        System.out.format("%.12f", percent);
    }
}