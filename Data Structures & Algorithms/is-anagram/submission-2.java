class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> memo1 = new HashMap<Character,Integer>();
        Map<Character,Integer> memo2 = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            memo1.put(s.charAt(i),memo1.getOrDefault(s.charAt(i),0)+1);
            memo2.put(t.charAt(i),memo2.getOrDefault(t.charAt(i),0)+1);
        }
        return memo1.equals(memo2);
    }
}
