// https://codeforces.com/problemset/problem/61/A

import java.util.*;
public class ultraFastMathematician{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String result = "";

        for(int i=0; i<num1.length(); i++){
            if(num1.charAt(i) == num2.charAt(i)){
                result = result +"0";
            } else{
                result = result +"1";
            }
        }
        System.out.println(result);
    }
}