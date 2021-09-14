public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 3, 67, 10, 60, 30, -56, -10};
        int target = 30;
        int result = linear_Search(arr, target);
        if(result == -1){
            System.out.println(target+ " not found");
        } else{
            System.out.println(target+ " found at index "+ result);
        }
    }
    static int linear_Search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
