class Solution {
    public void sortColors(int[] arr) {
        //o to low-1 --> all 0's
        //low to mid-1 --> all 1's
        //mid to high --> any numbers
        //high-1 to n-1 --> all 2's
        int low =0;
        int mid =0;
        int high = arr.length-1;
        while(mid<=high){
            
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;

            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}