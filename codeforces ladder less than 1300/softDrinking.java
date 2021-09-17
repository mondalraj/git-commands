// https://codeforces.com/problemset/problem/151/A

import java.util.*;

public class softDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int drink = (k*l)/nl;
        int lime = c*d;
        int salt = p/np;

        int maxToast = Math.min(drink, lime);
        int totalToast = Math.min(maxToast, salt);
        int eachToast = totalToast/n;

        System.out.println(eachToast);

    }
}
