// https://codeforces.com/problemset/problem/141/A

import java.util.*;

public class boyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[123];
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            arr[ascii]++;
        }
        int count = 0;
        for (int i = 97; i <= 122; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        } else{
            System.out.println("IGNORE HIM!");
        }
    }
}
