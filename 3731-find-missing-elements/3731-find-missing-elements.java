class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int val2=Integer.MIN_VALUE;
        int val1=Integer.MAX_VALUE;
        HashSet <Integer> temp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
            val1=Math.min(val1,nums[i]);
            val2=Math.max(val2,nums[i]);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=val1;i<=val2;i++){
            if(!temp.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}