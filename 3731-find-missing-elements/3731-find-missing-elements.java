class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums){
            hs.add(num);
            if(num < min) min = num;
            if(num > max) max = num;
        }

        for (int i = min + 1; i < max; i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }

        return ls;
    }
}