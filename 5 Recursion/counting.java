import java.util.*;

public class counting{

    static int count(int n){
        if(n==1){
            System.out.print(n+" ");
            return 0;
        }
        // System.out.print(n+ " ");
        count(n-1);
        System.out.print(n+ " ");
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        count(n);
    }
}