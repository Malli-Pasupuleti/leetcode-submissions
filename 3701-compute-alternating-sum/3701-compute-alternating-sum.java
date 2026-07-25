class Solution {
    public int alternatingSum(int[] nums) {
        int sumofall=0;
        for(int i=0;i< nums.length;i++){
            if((i&1)==1){
                sumofall-=nums[i];
            }else{
                sumofall+=nums[i];
            }
        }
        return sumofall;
    }
}