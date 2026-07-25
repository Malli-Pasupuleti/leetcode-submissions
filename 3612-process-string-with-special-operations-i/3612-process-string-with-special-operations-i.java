class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(ch);
            }else if(ch == '*' && !sb.isEmpty()){
                sb.setLength(sb.length() - 1);
            }else if(ch == '#'){
                sb.append(sb);
            }else if(ch == '%'){
                sb = sb.reverse();
            }
        }
        return sb.toString();
    }
}