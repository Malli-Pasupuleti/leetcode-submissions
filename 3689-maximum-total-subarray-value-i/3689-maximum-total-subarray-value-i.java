class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>y){
                y=nums[i];
            }
            if(nums[i]<x){
                x=nums[i];
            }
        }
        long sum=(long)(y-x)*k;
        return sum;
    }
}