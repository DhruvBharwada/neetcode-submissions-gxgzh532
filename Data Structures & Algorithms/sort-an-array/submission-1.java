class Solution {
    public int[] sortArray(int[] nums) {
        int low =0;
        int high = nums.length-1;
        qs(nums,low,high);
        return nums;
    }

    public void qs(int[] arr, int low , int high){
        if(low<high){
            int pIndex = findPivot(arr,low,high);
            qs(arr,low,pIndex-1);
            qs(arr,pIndex+1,high);
        }   
    }

    public int findPivot(int[] arr, int low ,int high){
        int pivot = arr[low];
        int i=low;
        int j = high;
        while(i<j){
            while( i<=high && arr[i]<=pivot) i++;
            while(j>=low && arr[j]>pivot) j--;

            if(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}