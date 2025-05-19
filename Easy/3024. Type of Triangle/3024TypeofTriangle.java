class Solution {
    public String triangleType(int[] nums) {
        
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                if(nums[i] > nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j] = t;
                }
            }
        }

        if(nums[0] + nums[1] <= nums[2]){
            return "none";
        }else if(nums[0]==nums[2]){
            return "equilateral";
        }else if(nums[0]==nums[1] || nums[1]==nums[2]){
            return "isosceles";
        }else{
            return "scalene";
        }

    }
}