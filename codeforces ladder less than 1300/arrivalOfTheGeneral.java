// https://codeforces.com/problemset/problem/144/A

import java.util.*;
public class arrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int minNum = arr[0], maxNum=arr[0], minIndex = 0, maxIndex =0;
        int count =0;
        //max 
        for(int i=0; i<n; i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        // System.out.println(maxNum+ " " + maxIndex);
        

        //max position
        for(int j=maxIndex; j>0; j--){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            count++;
        }

        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println(" ");


        //min
        for(int i=0; i<n; i++){
            if(arr[i]<=minNum){
                minNum = arr[i];
                minIndex = i;
            }
        }
        // System.out.println(minNum+ " " + minIndex);

        //min position
        for(int j=minIndex; j<n-1; j++){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            count++;
        }
        System.out.println(count);
    }
}
