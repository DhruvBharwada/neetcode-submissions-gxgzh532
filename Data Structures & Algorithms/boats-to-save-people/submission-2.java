class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int cnt = 0;
        while(left<=right){
            if(nums[right]==limit){
                right--;
            }else if(nums[left]+nums[right]== limit){
                right--;
                left++;
            }else if(nums[left]+nums[right]>limit){
                right--;
            }else if(nums[left]+nums[right]<limit){
                right--;
                left++;
            }
            cnt++;
        }
        return cnt;
    }
}