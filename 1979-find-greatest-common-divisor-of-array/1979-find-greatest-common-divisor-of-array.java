class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : nums){
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int ans  = GCD(min, max);

        return ans;
    }

    public static int GCD(int min, int max){
        while(min != max){
            if(min > max){
                min -= max;
            }else{
                max -= min;
            }
        }

        return min;
    }
}