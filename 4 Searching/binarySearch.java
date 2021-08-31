public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 8, 9, 20, 21, 27, 67, 88, 90, 100 };
        int target = 670;
        binary_Search(arr, target, 0, arr.length-1);

    }

    static int binary_Search(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            System.out.println(target + " found at position " + mid);
            System.exit(0);
        }
        if (start > end) {
            System.out.println(target + " not found");
            System.exit(0);
        } else if (arr[mid] > target) {
            end = mid - 1;
            binary_Search(arr, target, start, end);
        } else {
            start = mid + 1;
            binary_Search(arr, target, start, end);
        }
        return -1;
    }
}
