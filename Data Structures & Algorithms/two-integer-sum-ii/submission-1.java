class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;

        while(left<right){
            int ans = nums[left]+nums[right];
            if( ans == target) {
                return new int[]{left+1,right+1};
            }
            else if(ans < target){
                left++;
            }
            else right--;
        }
        return new int[]{-1, -1};
    }
}
