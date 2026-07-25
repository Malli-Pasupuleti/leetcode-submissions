class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int n : nums1){
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer> ls = new ArrayList<>();

        for (int n : nums2){
            if(hm.containsKey(n) && hm.get(n) > 0){
                ls.add(n);
                hm.put(n, hm.get(n) - 1);
            }
        }

        int[] res = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++){
            res[i] = ls.get(i);
        }

        return res;
    }
}