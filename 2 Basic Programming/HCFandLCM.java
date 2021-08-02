import java.util.*;

public class HCFandLCM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int orgNum1 = num1;
        int orgNum2 = num2;

        int hcf = 1;
    
        int it = 2;
        while(it < Math.min(num1, num2)){
            if(num1%it==0 && num2%it==0){
                num1/=it;
                num2/=it;
                hcf = hcf*it;
                it = 2;
            } else {
                it++;
            }
        }
        int lcm = (orgNum1*orgNum2)/hcf;

        System.out.println("The LCM of "+ orgNum1 +" and "+ orgNum2+ " is "+lcm);
        System.out.println("The HCF of "+ orgNum1 +" and "+ orgNum2+ " is "+hcf);
    }
}