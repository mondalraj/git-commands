import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array after Sorting : ");
        System.out.println(Arrays.toString(SelSort(size, arr)));
    }

    static int[] SelSort(int n, int[] arr) {
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1; j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println("Array after round "+ i);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}