public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000};
        int target = 1000;
        int order = sortOrder(arr);
        int ans;
        if(order == 1){
            ans = DescSearch(arr, target, 0, arr.length-1);
        } else{
            ans = AscSearch(arr, target, 0, arr.length-1);
        }
        System.out.println(ans);
    }
    static int sortOrder(int[] arr){
        if(arr[0]>arr[arr.length-1]){
            return 1;
        } else{
            return 0;
        }
    }
    static int AscSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int DescSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
