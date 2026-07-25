class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int x : nums1) s1.add(x);
        for(int x : nums2) s2.add(x);

        int ans1 = 0, ans2 = 0;

        for(int x : nums1){
            if(s2.contains(x)) ans1++;
        }

        for(int x : nums2){
            if(s1.contains(x)) ans2++;
        }
        
        return new int[]{ans1, ans2};
    }
}