class MaximumValueOfAnOrderedTripledI_BruteForce {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for(int i=0; i<nums.length-2; i++){

            for(int j=i+1; j<nums.length-1; j++){
                
                if(nums[i]<nums[j]){
                    continue;
                }

                for(int k=j+1; k<nums.length; k++){

                    long x = ((long)(nums[i]-nums[j])) * nums[k];
                    //System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    //System.out.println(i + " " + j + " " + k);
                    //System.out.println(x);

                    if(x>max){
                        max = x;
                    }

                }
            }
        }

        return max;

    }
}