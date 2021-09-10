// https://codeforces.com/problemset/problem/281/A

import java.util.*;
public class wordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        if(Character.isLowerCase(ch[0])){
            ch[0] = (char) ((int)ch[0] - 32);
        }
        for(int i=0; i< ch.length; i++){
            System.out.print(ch[i]);
        }
    }
}
