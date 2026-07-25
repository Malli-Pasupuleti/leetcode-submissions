class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for ( int i = 0; i <n; i++){
            if(nums[i] == target){
                nums[i] = 1;
            }else{
                nums[i] = -1;
            }
        }
        for (int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){

              sum += nums[j];

                if (sum > 0){
                  ans++;
                }
            }
        }

        return ans;
    }
}