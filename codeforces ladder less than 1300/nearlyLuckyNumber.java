// https://codeforces.com/problemset/problem/110/A

import java.util.*;
public class nearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
    
        int luckyCount = 0;

        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '4' || num.charAt(i)=='7'){
                luckyCount++;
            }
        }
        if(luckyCount ==4 || luckyCount==7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
