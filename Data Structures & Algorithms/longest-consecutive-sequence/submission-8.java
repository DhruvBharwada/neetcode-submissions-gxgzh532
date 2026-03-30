class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }
        int longest = 1;
        for( int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
