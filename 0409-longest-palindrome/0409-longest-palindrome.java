class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        boolean odd = false;
        for (int c : map.values()){
            if(c % 2 == 0){
                ans += c;
            }else{
                ans += c - 1;
                odd = true;
            }
        }
        if(odd) ans++;

        return ans;
    }
}