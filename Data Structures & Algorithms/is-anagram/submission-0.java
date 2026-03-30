class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;  
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);
            mpp.put(t.charAt(i), mpp.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(Map.Entry<Character,Integer>entry : mpp.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
