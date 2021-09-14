public class searchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int start = 2;
        int end = 6;
        int target = 1;
        System.out.println(search_In_Range(arr, start, end, target));
    }

    static boolean search_In_Range(int[] arr, int start, int end, int target) {
        if (end < start) {
            return false;
        }
        if (start < 0) {
            return false;
        }
        if (end >= arr.length) {
            return false;
        }
        if (arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
