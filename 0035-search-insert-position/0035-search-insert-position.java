class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        
        // int idx = 0;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > target){
                // idx = mid;
                r = mid - 1;
            }else if(nums[mid] < target){
                // idx = mid;
                l =mid + 1;
            }else{
                return mid;
            }
        }
        // return idx;
        return l;
    }
}