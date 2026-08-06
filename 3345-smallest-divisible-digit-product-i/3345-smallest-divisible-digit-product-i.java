class Solution {
    public int smallestNumber(int n, int t) {
        while (true){
            if((solve(n) % t) == 0){
                return n;
            }else{
                n++;
            }
        }
    }

    public int solve(int n){
        int product = 1;
        while (n > 0){
            int rem = n % 10;
            product *= rem;
            n /= 10;
        }
        return product;
    }
}