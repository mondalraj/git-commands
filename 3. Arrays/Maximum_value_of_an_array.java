import java.util.Scanner;

public class Maximum_value_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = max(arr);
        System.out.println("The maximum value in the array is " + max);
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
