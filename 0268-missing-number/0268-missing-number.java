class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        int xor = 0;
        for(int i = 0; i <= len; i++){
            xor ^= i;
        }
        for(int i = 0; i < len; i++){
            xor ^= nums[i];
        }
        return xor;
    }
}
        // int sum = len * (len + 1) / 2;
        // int real = 0;
        // for(int i = 0; i < len; i++){
        //     real += nums[i];
        // }
        // return sum - real;