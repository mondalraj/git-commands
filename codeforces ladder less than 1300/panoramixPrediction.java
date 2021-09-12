// https://codeforces.com/problemset/problem/80/A

import java.util.*;
public class panoramixPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0 ;
        int n= sc.nextInt();
        int m= sc.nextInt();

        for(int i = n+1; i<=m; i++){
            for(int j = 2; j<i; j++){
                
                if(i%j != 0 && i==m && j ==i-1){
                    System.out.println("YES");
                    flag =1;
                    break;
                } else if(i%j ==0 && i==m){
                    break;
                } else if(j==i-1 && i<m){
                    System.out.println("NO");
                    System.exit(0);
                } else if(i%j==0){
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("NO");
        }
    }
}
