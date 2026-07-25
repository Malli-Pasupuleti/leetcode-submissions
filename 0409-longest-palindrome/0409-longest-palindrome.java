class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[128];

        for (char ch : s.toCharArray()){
            freq[ch]++;
        }

        int ans = 0;
        boolean flag = false;
        for (int c : freq){
            if(c % 2 == 0){
                ans += c;
            }else{
                ans += c - 1;
                flag = true;
            }
        }
        if(flag) ans++;

        return ans;
    }
}