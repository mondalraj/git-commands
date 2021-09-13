// http://codeforces.com/problemset/problem/148/A
import java.util.*;

public class insomniaCure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[d];
        Arrays.fill(arr, 0);
        for (int i=k-1; i<d;){
            if(arr[i]==0){
                arr[i] =1;
            }
            i=i+k;
        }
        for (int i=l-1; i<d;){
            if(arr[i]==0){
                arr[i] =1;
            }
            i=i+l;
        }
        for (int i=m-1; i<d;){
            if(arr[i]==0){
                arr[i] =1;
            }
            i=i+m;
        }
        for (int i=n-1; i<d;){
            if(arr[i]==0){
                arr[i] =1;
            }
            i=i+n;
        }
        int count = 0;
        for(int j = 0; j<d; j++){
            if(arr[j]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}