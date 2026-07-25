class Solution {
    public long removeZeros(long n) {
        long value=n;
        long reverse=0;
        while(value>0){
            long remider=value%10;
            if(remider==0){
                value/=10;
                continue;
            }
            reverse=(reverse*10)+remider;
            value/=10;
        }
        long normal=0;
        while(reverse>0){
            long rem=reverse%10;
            normal=(normal*10)+rem;
            reverse/=10;
        }
        return normal;
    }
}