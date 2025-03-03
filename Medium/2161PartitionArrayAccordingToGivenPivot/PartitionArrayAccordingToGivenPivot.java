class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int arr[] = new int[n];
        int low = 0;
        int high = n-1;

        int lr = 0;
        int hr = n-1;

        while(lr<n){
            if(nums[lr]<pivot){
                arr[low] = nums[lr];
                low++;
            }
            if(nums[hr]>pivot){
                arr[high] = nums[hr];
                high--;
            }
            lr++;
            hr--;
        }
        while(low<=high){
            arr[low] = pivot;
            low++;
        }
        return arr;
    }
}