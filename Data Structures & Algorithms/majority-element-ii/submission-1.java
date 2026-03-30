class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int validCount = (n/3)+1;
        int cnt = 0;

        for(int i = 0 ; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])== validCount){
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}