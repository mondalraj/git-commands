public class CeilingOfANumber{
    public static void main(String[] args) {
        int[] arr = {100, 90, 78, 45, 34, 20, 10, 5, 0, -1, -5};
        int target = 11;
        int order = sortOrder(arr);
        int ans;
        if(order == 1){
            ans = DescSearch(arr, target);
        } else{
            ans = AscSearch(arr, target);
        }
        System.out.println(arr[ans]);
    }
    static int sortOrder(int[] arr){
        if(arr[0]>arr[arr.length-1]){
            return 1;
        } else{
            return 0;
        }
    }
    static int AscSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
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
        return start;
    }
    static int DescSearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
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
        return end;
    }
}