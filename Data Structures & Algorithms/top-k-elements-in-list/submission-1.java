class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        map.forEach((key,value)->{
            arr.add(new int[] {value,key});
        });
        arr.sort((a,b) -> b[0] - a[0]); // sort the array based on the first part of the array 
        //b[0] - a[0] makes it desending
        // a[0] - b[0] makes it asending
        int[] ans = new int[k];
        for(int i =0 ; i<k;i++){
            ans[i] = arr.get(i)[1];
        }
        return ans;
    }
}
