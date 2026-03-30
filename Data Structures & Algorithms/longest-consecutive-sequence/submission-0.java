class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int longest = 1;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int cnt = 1;
            for(int j = 0;j<nums.length ;j++){
               if(nums[j] == x + 1){
                cnt++;
                x++;
                j = -1;
               }
            }
            longest = Math.max(cnt,longest);
        }
        return longest;

    }
}
