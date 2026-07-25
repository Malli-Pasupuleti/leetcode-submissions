class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans=0;
        Map<Integer,Integer> fre=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            fre.put(nums[i],fre.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: fre.entrySet()){
            if((entry.getValue()%k)==0){
                ans+=(entry.getKey()*entry.getValue());
            }
        }
        return ans;
    }
}