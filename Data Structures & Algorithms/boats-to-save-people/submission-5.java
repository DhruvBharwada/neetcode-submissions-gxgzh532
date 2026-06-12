class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int[] count = new int[limit + 1];
        for (int num : nums) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i <= limit; i++) {
            while (count[i] > 0) {
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
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