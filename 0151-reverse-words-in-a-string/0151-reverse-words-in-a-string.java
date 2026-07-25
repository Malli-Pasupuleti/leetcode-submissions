class Solution {
    public String reverseWords(String s) {
        String[] ch = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i = ch.length - 1; i >= 1; i--){
            sb.append(ch[i]);
            sb.append(" ");
        }
        sb.append(ch[0]);
        return sb.toString();
    }
}