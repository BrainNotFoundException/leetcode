class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public int longestMonotonicSubarray(int[] nums) {

        int incLong = 1;
        int decLong = 1;
        int cInc=1;
        int cDec=1;

        for(int i=1; i<nums.length; i++){
            
            if(nums[i] > nums[i-1]){
                cInc+=1;
            }else{
                if(cInc>incLong){
                    incLong=cInc;
                }
                cInc=1;
            }

            
            if(nums[i] < nums[i-1]){
                cDec+=1;
            }else{
                if(cDec>decLong){
                    decLong=cDec;
                }
                cDec=1;
            }
        }
        
        if(cDec>decLong){
            decLong=cDec;
        }
        if(cInc>incLong){
            incLong=cInc;
        }
        
        return incLong>decLong?incLong:decLong;

    }
}