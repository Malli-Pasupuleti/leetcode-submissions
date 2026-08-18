class Solution {
    public int largestInteger(int[] nums, int k) {

        int max = nums[0];
        if(k == nums.length){
            for (int i = 1; i < nums.length; i++){
                if(nums[i] > max) max = nums[i];
            }
            return max;
        }

        int[] freq = new int[51];

        for (int i = 0; i < nums.length - k + 1; i++){
            for (int j = i; j < i + k; j++){
                freq[nums[j]]++;
            }
        }

        int ans = -1;
        for (int i = 50; i >= 0; i--){
            if (freq[i] == 1){
                ans = i;
                break;
            }
        }

        return ans;
    }
}