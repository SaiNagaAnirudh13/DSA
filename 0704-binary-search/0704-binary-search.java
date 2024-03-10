class Solution {
    public int search(int[] nums, int target) {
        return searchfunc(nums,0,nums.length-1,target);
        
    }
    public int searchfunc(int[] nums ,int startindex, int endindex , int target){
        if (startindex>endindex){
            return -1;
            
        }
        int mid =startindex + (endindex-startindex)/2;
        if (target == nums[mid]){
            return mid;
        }
        else if (target <nums[mid]){
            return searchfunc (nums,startindex , mid-1,target);
        }
        else {
            return searchfunc (nums,mid+1,endindex,target);
        }
    }
}






