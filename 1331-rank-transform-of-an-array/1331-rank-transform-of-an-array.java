class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] dup = arr.clone();
        Arrays.sort(dup);

        HashMap<Integer, Integer> hm = new HashMap<>();

        int rank = 1;
        for (int i = 0; i < dup.length; i++){
            if (!hm.containsKey(dup[i])){
                hm.put(dup[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = hm.get(arr[i]);
        }

        return arr;
    }
}