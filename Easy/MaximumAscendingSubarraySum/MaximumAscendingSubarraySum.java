class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0], csum=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                csum+=nums[i];
            }else{
                if(csum>sum){
                    sum=csum;
                }
                csum=nums[i];
            }
        }

        return csum>sum?csum:sum;
    }
}