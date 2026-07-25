class Solution {
    public int minAbsoluteDifference(int[] nums) {
       List<Integer> t1 = new ArrayList<>();
        List<Integer>  t2 = new ArrayList<>();


        
        int length = nums.length;
        for(int i = 0; i < length ; i++){
            if(nums[i]==1){

                
                t1.add(i);
            }else if(nums[i]==2){
                t2.add(i);
            }
        }
        int n = t1.size();
        int m =t2.size();
        int ans = 101;
        for(int i = 0; i < n ; i++){
            int val = t1.get(i);
            for(int j = 0;j < m ;j++){
                ans = Math.min(ans,Math.abs(val-t2.get(j)));
            }
        }
        return (ans==101)? -1: ans;
    }
}