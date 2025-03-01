class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {

        int n = nums.length - 1;
        for(int i=0; i<n; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1]=0;
            }
        }

        int arr[] = new int[n+1];
        int count = 0;
        for(int i=0; i<=n; i++){
            if(nums[i]!=0){
                arr[count] = nums[i];
                count++;
            }
        }

        return arr;

    }
}