class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();

        for(int i = 0; i < haystack.length() - len + 1; i++){
            String sub = haystack.substring(i, i + len);
            if(needle.equals(sub)){
                return i;
            }
        }
        return -1;
    }
}