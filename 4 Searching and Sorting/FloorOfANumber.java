public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {-1,0, 4, 7, 10, 23, 45, 67, 89, 100};
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
        return end;
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
        return start;
    }
}

