class Solution {

    public int[] sortArray(int[] nums) {
        qs(nums, 0, nums.length - 1);
        return nums;
    }

    public void qs(int[] arr, int low, int high){

        if(low < high){

            int pIndex = findPivot(arr, low, high);

            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    public int findPivot(int[] arr, int low, int high){

        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while(i <= j){

            while(i <= high && arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}