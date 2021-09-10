// https://codeforces.com/problemset/problem/69/A

import java.util.*;

public class youngPhysicist {
    public static void main(String[] args) {
        int n, x, y, z, xsum = 0, ysum = 0, zsum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            xsum += x;
            ysum += y;
            zsum += z;

            n--;
        }

        if (xsum == 0 && ysum == 0 && zsum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
