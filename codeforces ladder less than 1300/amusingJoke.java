// https://codeforces.com/problemset/problem/141/A

import java.util.*;

public class amusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        String merge = str1 + str2;

        char[] merged = merge.toCharArray();
        char[] s3 = str3.toCharArray();

        Arrays.sort(merged);
        Arrays.sort(s3);

        int flag = 1;
        if(merged.length != s3.length){
            flag =0;
        } else{
            for(int i=0; i<s3.length;i++){
                if(merged[i] != s3[i]){
                    flag =0;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("NO");
        } else{
            System.out.println("YES");
        }

    }
}
