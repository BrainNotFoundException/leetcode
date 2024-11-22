class FindIfArrayCanBeSorted {
    public boolean canSortArray(int[] nums) {

        int cur_sma = nums[0];
        int cur_lar = nums[0];
        int prev_lar = 0;
        int prev_bits = Integer.bitCount(nums[0]);

        for (int i=1; i<nums.length; i++){

            if (prev_bits == Integer.bitCount(nums[i])){
                
                if (cur_sma>nums[i]){
                    cur_sma=nums[i];
                }
                if (cur_lar<nums[i]){
                    cur_lar=nums[i];
                }

            }else{

                if (cur_sma<prev_lar){
                    return false;
                }
                prev_lar = cur_lar;
                prev_bits = Integer.bitCount(nums[i]);
                cur_lar = nums[i];
                cur_sma = nums[i];
            }

        }

        return cur_sma >= prev_lar;
        
    }
}