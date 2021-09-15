// https://codeforces.com/problemset/problem/71/A

import java.util.*;
public class wayTooLongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] str = new String[n+1];
        for (int i=0;i<str.length;i++){
            str[i] = sc.nextLine();
        }
        
        for (int i=0;i<str.length;i++){
            if(str[i].length()>10){
                System.out.print(str[i].charAt(0));
                System.out.print(str[i].length()-2);
                System.out.print(str[i].charAt(str[i].length()-1));
            } else{
                System.out.print(str[i]);
            }
            System.out.println("");
        }
    }
}