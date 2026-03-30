class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        //create an array list for every element that exists
        for(int i = 0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        // nums[i] as key and freq as value
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //putting the element on the index of its frequency
        // if 1 occur 3 times then 1 is on index 3
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int ans[] = new int[k];
        int idx = 0;
        for(int i = freq.length-1;i>0 && idx < k;i--){
            for(int n : freq[i]){
                ans[idx] = n ;
                idx++;
                if(idx == k) return ans;
            }
        }
        return ans;
    }
}
