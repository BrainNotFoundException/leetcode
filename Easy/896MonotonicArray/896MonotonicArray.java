class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        
        if(nums.length <= 2){
            return true;
        }

        int previ=nums[0];
        int i = nums[1];
        int n = nums.length;
        boolean inc = false, flag = false;
        
        int c=2;

        while(c<=n){

            if(i>previ){

                if(!inc && flag){
                    return false;
                }
                inc = true;
                flag = true;

            }else if(i<previ){
                
                if(inc && flag){
                    return false;
                }
                flag = true;

            }
            if(c==n){
                break;
            }
            previ = i;
            i = nums[c];
            c++;

        }

        return true;
    }
}