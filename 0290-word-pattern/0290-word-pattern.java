class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = arr[i];

            if(hm1.containsKey(ch) && !hm1.get(ch).equals(word)){
                return false;
            }
            hm1.put(ch, word);

            if(hm2.containsKey(word) && !hm2.get(word).equals(ch)){
                return false;
            }
            hm2.put(word, ch);
        }

        return true;
    }
}