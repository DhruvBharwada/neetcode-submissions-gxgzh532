class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String word : strs){
            String key = stringFrequency(word);
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values()); 
    }

    public String stringFrequency(String s){
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                char c = (char)(i+'a');
                sb.append(c);
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }

}
