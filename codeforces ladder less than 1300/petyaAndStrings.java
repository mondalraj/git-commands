// https://codeforces.com/problemset/problem/112/A

import java.util.*;

public class petyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int value = 0;
		for (int i = 0; i < str1.length(); i++)
			if (str1.charAt(i) == str2.charAt(i))
				continue;
			else if (str1.charAt(i) < str2.charAt(i)) {
				value = -1;
				break;
			} else {
				value = 1;
				break;
			}
		System.out.println(value);
    }
}