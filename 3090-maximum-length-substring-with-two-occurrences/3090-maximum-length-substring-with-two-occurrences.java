class Solution {
    public int maximumLengthSubstring(String s) {
        int p1 = 0;
        int p2 = 0;
        int len = s.length();
        int ans = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        while(p2 < len){
            char ch = s.charAt(p2);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            while(hm.get(ch) > 2){
                char left = s.charAt(p1);
                hm.put(left, hm.get(left) - 1);

                if(hm.get(left) == 0){
                    hm.remove(left);
                }
                p1++;
            }
            ans = Math.max(ans, p2 - p1 + 1);
            p2++;
        }

        return ans;
    }
}