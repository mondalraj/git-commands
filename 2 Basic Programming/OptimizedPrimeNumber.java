import java.util.*;

public class OptimizedPrimeNumber {
    public static void main(String[] args) {
        int it = 2;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.println("Square root of "+ num+ " is "+ sqrt);

        while(it < Math.sqrt(num)){
            if(num % it == 0){
                System.out.println(num+" is not prime");
                System.exit(0);
            } else{
                it++;
            }
        }
        System.out.println(num+ " is prime");
    }
}