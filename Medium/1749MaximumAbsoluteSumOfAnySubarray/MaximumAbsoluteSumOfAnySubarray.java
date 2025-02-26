class MaximumAbsoluteSumOfAnySubarray {
    public int maxAbsoluteSum(int[] nums) {
        
        int min=nums[0], max=nums[0];
        int minout = nums[0], maxout=nums[0];

        for(int i=1; i<nums.length; i++){

            min = Math.min(min+nums[i], nums[i]);
            max = Math.max(max+nums[i], nums[i]);

            minout = Math.min(minout, min);
            maxout = Math.max(maxout, max);

        }

        if(minout<0){
            minout=-minout;
        }
        if(maxout<0){
            maxout=-maxout;
        }

        return maxout>minout?maxout:minout;
    }
}