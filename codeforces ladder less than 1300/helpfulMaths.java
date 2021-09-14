// https://codeforces.com/problemset/problem/339/A

import java.util.*;

public class helpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[str.length()/2+1];
        int index =0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) != '+'){
                char c = str.charAt(i);
                arr[index] = Character.getNumericValue(c);
                index++;
            }
        }
        Arrays.sort(arr);
        for(int j=0; j<arr.length;j++){
            if(j!=arr.length-1){
                System.out.print(arr[j]+"+");
            } else{
                System.out.print(arr[j]);
            }
        }
    }
}