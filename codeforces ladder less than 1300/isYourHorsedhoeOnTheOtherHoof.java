// https://codeforces.com/problemset/problem/228/A

import java.util.*;

public class isYourHorsedhoeOnTheOtherHoof {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] s = new int[4];
        int c = 3;
        for (int i = 0; i < 4; i++) {
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        for (int i = 0; i < 3; i++) {
            if(s[i]!=s[i+1]){
                c--;
            }
        }
        System.out.println(c);
    }

}
