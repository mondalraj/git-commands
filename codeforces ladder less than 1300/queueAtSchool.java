// https://codeforces.com/problemset/problem/266/B

import java.util.*;

public class queueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        n = sc.nextInt();
        t = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char c[] = str.toCharArray();
        
        while (t > 0) {
            for (int i = 0; i < c.length; i++) {
                if(i==n-1){
                    break;
                }
                if (c[i] == 'B' && c[i+1] == 'G') {
                   
                    c[i] = 'G';
                    c[i+1] = 'B';
                    i++;
                }
            }
            t--;
        }
        // for (int i = 0; i < c.length; i++){
        //     System.out.println(c[i]);
        // }
        System.out.println(c);
    }
}