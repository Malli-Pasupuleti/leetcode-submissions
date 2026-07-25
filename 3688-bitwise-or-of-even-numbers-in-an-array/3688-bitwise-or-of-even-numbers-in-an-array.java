class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
       int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==0){
            if(i!=0){
                count=count|nums[i];
            }else {
                count=nums[i];
            }
            }
        }
        return count;
    }
}