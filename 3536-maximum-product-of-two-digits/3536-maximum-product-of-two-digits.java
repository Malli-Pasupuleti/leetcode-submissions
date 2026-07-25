class Solution {
    public int maxProduct(int n) {
        List<Integer> ls = new ArrayList<>();

        while(n > 0){
            int rem = n % 10;
            ls.add(rem);
            n /= 10;
        }

        Collections.sort(ls);

        return ls.get(ls.size() - 1) * ls.get(ls.size() - 2);
    }
}