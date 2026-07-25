class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ls = new ArrayList<>();
        String s = "123456789";

        for (int len = 2; len <= 9; len++){
            for (int i = 0; i + len <= 9; i++){
                int n = Integer.parseInt(s.substring(i, i + len));
                
                if(low <= n && n <= high){
                    ls.add(n);
                }
            }
        }

        return ls;
    }
}