import java.util.Arrays;

public class Reversing_an_array {
    public static void main(String[] args) {
        int[] arr = { 23, 67, 90, 3, 56, 78};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
