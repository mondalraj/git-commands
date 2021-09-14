// https://codeforces.com/problemset/problem/116/A

import java.util.*;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // number of stops
		int enter, exit, currentCapacity, minCapacity;
		enter = exit = currentCapacity = minCapacity = 0;
		for (int i = 0; i < n; i++) {
			exit = sc.nextInt();
			enter = sc.nextInt();

			currentCapacity -= exit;
			currentCapacity += enter;

			if (currentCapacity > minCapacity) {
				minCapacity = currentCapacity;
			}
		}
		System.out.println(minCapacity);
    }
}
