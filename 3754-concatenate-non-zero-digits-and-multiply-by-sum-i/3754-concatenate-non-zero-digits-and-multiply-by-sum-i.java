class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            n /= 10;

            if (r != 0) {
                x = x * 10 + r;
                sum += r;
            }
        }

        // Reverse x
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        x = rev;

        return (long) x * sum;
    }
}