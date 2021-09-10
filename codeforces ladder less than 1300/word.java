// https://codeforces.com/problemset/problem/59/A

import java.util.*;
public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerCount = 0, upperCount = 0;
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        for(int i = 0; i< ch.length; i++){
            if(Character.isUpperCase(ch[i])){
                upperCount++;
            } else {
                lowerCount++;
            }
            if(upperCount>lowerCount){
                str = str.toUpperCase();
            } else{
                str = str.toLowerCase();
            }
        }
        System.out.println(str);
    }
}
