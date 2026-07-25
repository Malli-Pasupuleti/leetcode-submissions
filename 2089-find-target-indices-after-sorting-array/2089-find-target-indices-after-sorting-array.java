class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0, equal = 0;

        for(int num : nums){
            if(num < target){
                smaller++;
            }else if(num == target){
                equal++;
            }
        }

        List<Integer> ls = new ArrayList<>();

        for(int i = 0; i < equal; i++){
            ls.add(smaller + i);
        }

        return ls;
    }
}