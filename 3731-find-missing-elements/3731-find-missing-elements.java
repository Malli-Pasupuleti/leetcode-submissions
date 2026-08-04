class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        
        Arrays.sort(nums);
        int curr = nums[0];

        for (int num : nums){
            while (curr < num){
                ls.add(curr);
                curr++;
            }
            curr = num + 1;
        }

        return ls;
    }
}