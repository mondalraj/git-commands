// https://codeforces.com/problemset/problem/282/A

import java.util.*;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
 
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (str[i].equalsIgnoreCase("++X") || str[i].equalsIgnoreCase("X++")) {
                ans = ans + 1;
            } else if (str[i].equalsIgnoreCase("--X") || str[i].equalsIgnoreCase("X--")) {
                ans = ans - 1;
            }
        }

        System.out.println(ans);
    }
}