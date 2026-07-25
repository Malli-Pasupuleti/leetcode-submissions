class Solution {
    public int mirrorDistance(int n) {
         int te=n;
        int reverse=0;
        while(te>0){
            int reminder=te%10;
            reverse=reverse*10+reminder;
            te/=10;
        }
        return Math.abs(n-reverse);
    }
}