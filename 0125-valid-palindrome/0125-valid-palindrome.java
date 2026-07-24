class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        int f = 0;
        int l = sb.length() - 1;
        while (f <= l){
            if (sb.charAt(f++) != sb.charAt(l--)){
                return false;
            }
        }

        return true;
    }
}