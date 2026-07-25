class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> hs = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        int  i = 0;
        for(int x : hs){
            nums[i++] = x;
        }
        return hs.size();
    }
}