class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int idx = 0;
        for(int key : map.keySet()) {
        nums[idx] = key;
        idx++;
        }   
        return idx;
    }
}