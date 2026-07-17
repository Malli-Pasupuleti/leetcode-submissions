class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()){
            ch = Character.toLowerCase(ch);

            sb.append(ch);
        }

        return sb.toString();
    }
}