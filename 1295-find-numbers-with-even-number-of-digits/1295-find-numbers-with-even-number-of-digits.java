class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if(evenCount(nums[i])){
                count++;
            }
        }
        
        return count;
    }

    public static boolean evenCount(int n){
        int c = 0;
        while(n > 0){
            n /= 10;
            c++;
        }
        if(c % 2 == 0){
            return true;
        }

        return false;
    }
}