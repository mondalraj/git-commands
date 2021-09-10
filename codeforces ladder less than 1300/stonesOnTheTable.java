// https://codeforces.com/problemset/problem/266/A

import java.util.*;
public class stonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        String str = sc.next();
        char[] s = str.toCharArray();
        for(int i =0; i<n-1; i++){
            if(s[i] == s[i+1]){
                count++;
            }
        }
        System.out.println(count);


        // Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// String s = sc.next();

		// // Counters
		// int counter = 0;
		// char last = s.charAt(0);

		// for (int i = 1; i < n; i++) {
		// 	if (s.charAt(i) == last) counter++;
		// 	else last = s.charAt(i);
		// }

		// // Output
		// System.out.println(counter);
        
    }
}
