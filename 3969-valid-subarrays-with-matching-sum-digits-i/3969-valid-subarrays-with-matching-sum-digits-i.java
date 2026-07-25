class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums;
        long[] pre = new long[nums.length + 1];

        pre[0] = 0;
        for(int i = 0; i < nums.length; i++){
            pre[i + 1] = pre[i] + nums[i];
        }

        int count = 0;
        int n = nums.length;
        // long sum = 0;
        for (int l = 0; l < n; l++){
            for (int r = l; r < n; r++){
              long  sum = pre[r + 1] - pre[l];
                if(first(sum, x) && last(sum, x)){
                count++;
                }
            }
        }
        return count;
    }
    public static boolean last(long num, int x){
        int remainder = (int)(num % 10);
        if(remainder == x){
            return true;
        }
        return false;
    }
    public static boolean first(long num, int x){
        while(num >= 10){
            num /= 10;
        }
        if(num == x){
            return true;
        }
        return false;
    }
}