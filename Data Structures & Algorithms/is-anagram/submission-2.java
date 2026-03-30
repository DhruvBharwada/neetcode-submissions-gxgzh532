class Solution {
    public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()) return false;  
    //     HashMap<Character, Integer> map = new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    //     }
    //     for(int i=0;i<t.length();i++){
    //         char c = t.charAt(i);
    //         if(!map.containsKey(c) || map.get(c)==0){
    //             return false;
    //         }
    //         map.put(c,map.get(c)-1);
    //     }
       
    //     return true;
    // }
    if(s.length() != t.length()) return false;  
    int[] freq = new int[26];
    // s = s.toLowerCase();
    // t = t.toLowerCase();
    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]!=0) return false;
    }
    return true;
}
}
