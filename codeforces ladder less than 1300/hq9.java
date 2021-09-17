// https://codeforces.com/problemset/problem/133/A

import java.util.*;

public class hq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int flag =0;
        for(int i=0; i<p.length();i++){
            if(p.charAt(i)=='H' || p.charAt(i)=='Q' || p.charAt(i)=='9' ){
                flag =1;
                break;
            }
        }
        if(flag==0){
            System.out.println("NO");
        } else{
            System.out.println("YES");
        }
    }
}
