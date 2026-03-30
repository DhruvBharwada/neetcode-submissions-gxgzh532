class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int ans = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]==ans){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                ans = arr[i+1];
            }

        }

        return ans;
        
    }
}