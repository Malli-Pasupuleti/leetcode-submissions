class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        for(int i = 0; i < names.length; i++){
            tm.put(heights[i], names[i]);
        }
        
        String[] arr = new String[names.length];
        int i = 0;

        for(Map.Entry<Integer, String> e : tm.descendingMap().entrySet()){
            arr[i++] = e.getValue();
        }
        return arr;
    }
}