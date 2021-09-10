// https://codeforces.com/problemset/problem/32/B

import java.util.*;
public class borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i< str.length(); ){
            if(str.charAt(i) == '.'){
                System.out.print('0');
                i++;
            } else if(str.charAt(i)=='-' && str.charAt(i+1)=='.'){
                System.out.print('1');
                i+=2;
            } else if(str.charAt(i)=='-' && str.charAt(i+1)=='-'){
                System.out.print('2');
                i+=2;
            }
        }
    }
}
