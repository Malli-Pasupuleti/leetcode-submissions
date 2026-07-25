class Solution {
    public int maxDistance(String moves) {
       int u = 0;
       int d = 0;
       int l = 0;
       int r = 0;
       int s = 0;

       for (char x : moves.toCharArray()){
           if(x == 'U') u++;
           else if(x == 'D') d++;
           else if(x == 'L') l++;
           else if(x == 'R') r++;
           else s++;
       }
         
        return Math.abs(l - r) + Math.abs(u - d) + s;
    }
}