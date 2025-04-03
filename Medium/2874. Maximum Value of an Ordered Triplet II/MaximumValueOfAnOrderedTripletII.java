class MaximumValueOfAnOrderedTripledII {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;

        int maxi[] = new int[n];
        int maxk[] = new int[n];
        maxi[0] = nums[0];
        maxk[n-1] = nums[n-1];

        for(int i=0; i<n-1; i++){
            maxi[i+1] = maxi[i]>nums[i]?maxi[i]:nums[i];
            maxk[n-i-2] = maxk[n-i-1]>nums[n-i-1]?maxk[n-i-1]:nums[n-i-1];
        }

        long max=0;
        for(int j=1; j<n-1; j++){
            if( ((long)(maxi[j] - nums[j]) * maxk[j]) > max ){
                max=((long)(maxi[j] - nums[j])) * maxk[j];
            }
        }

        return max;
    }
}