import java.util.Arrays;

public class Swapping_values_in_an_array{
    
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 78, 90, 32};
        swap(arr, 2, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}