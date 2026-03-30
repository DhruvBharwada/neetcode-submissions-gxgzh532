class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = -9999;
        int el2 = -9999;
        for(int i = 0 ; i < nums.length ; i++){
            if(cnt1 == 0 && el2 != nums[i]){
                el1 = nums[i] ;
                cnt1 = 1;
            }
            else if(cnt2 == 0 && el1 != nums[i]){
                el2 = nums[i];
                cnt2 = 1;
            }
            else if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        for(int i= 0 ; i < nums.length ; i++){
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }
        int mini = (nums.length/3)+1;
        if(cnt1>=mini) ls.add(el1);
        if(cnt2>=mini) ls.add(el2);
        return ls;
    }
}