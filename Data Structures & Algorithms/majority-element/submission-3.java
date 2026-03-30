class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int ans = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]== ans && count>=0){
                count++;
            }
            else if(count>0){
                count--;
            }
            else{
                ans = arr[i+1];
            }
        }
        return ans; 
    }
}