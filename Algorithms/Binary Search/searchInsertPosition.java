// https://leetcode.com/problems/search-insert-position/submissions/

public class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        if(target<nums[start]){
            return start;
        }
            
        if(target>nums[end]){
            return end+1;
        }
        
        while(start<=end){
            int mid = (start+end)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            
            if(target>nums[mid] && target<nums[mid+1]){
                return mid+1;
            }
            
            if(target>nums[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
