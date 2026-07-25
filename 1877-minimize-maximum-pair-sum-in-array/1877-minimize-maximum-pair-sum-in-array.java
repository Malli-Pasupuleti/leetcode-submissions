class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int p1=0,p2=nums.length-1;
        while(p1<p2){
            max=Math.max(max,nums[p1]+nums[p2]);
            p1++;
            p2--;
        }
        return max;
    }
}