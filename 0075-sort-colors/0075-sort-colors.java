class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int r = 0;
        int w = 0;
        int b = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0) r++;
            else if(nums[i] == 1) w++;
            else b++;
        }
        int i = 0;
        while(i < r){
            nums[i++] = 0;
        }
        while(i < r + w){
            nums[i++] = 1;
        }
        while(i < n){
            nums[i++] = 2;
        }
    }
}