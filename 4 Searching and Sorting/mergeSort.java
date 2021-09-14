import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array after Merging and Sorting : ");
        System.out.println(Arrays.toString(MergeSort(arr1, arr2)));
    }

    static int[] MergeSort(int arr1[], int arr2[]) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }
}
