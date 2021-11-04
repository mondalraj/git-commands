// https://leetcode.com/problems/squares-of-a-sorted-array/

public class squaresOfASortedArray{
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0, end = nums.length-1;
        int currentIndex = end;
        while(start<=end && currentIndex>=0){
            if(Math.abs(nums[start])<Math.abs(nums[end])){
                ans[currentIndex] = nums[end]*nums[end];
                currentIndex--;
                end--;
            }else{
                ans[currentIndex] = nums[start]*nums[start];
                currentIndex--;
                start++;
            }
        }
        return ans;
    }
}