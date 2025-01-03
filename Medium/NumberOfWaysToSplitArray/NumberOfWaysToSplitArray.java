class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {

        long sums[] = new long[nums.length];
        int count=0;
        long sum=0;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            sums[i] = sum;
        }

        for(int i=0; i<nums.length-1; i++){
            if (sums[i] >= sum - sums[i]){
                count++;
            }
        }

        return count;

    }
}