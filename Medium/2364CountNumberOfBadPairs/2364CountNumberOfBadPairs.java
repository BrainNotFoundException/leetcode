import java.util.HashMap;

class CountNumberOfBadPairs {
    public long countBadPairs(int[] nums) {
        
        int goodpairs;
        long badpairs=0;

        HashMap<Integer, Integer> values = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            
            values.put(nums[i]-i, values.getOrDefault(nums[i]-i, 0)+1);
            goodpairs=values.get(nums[i]-i)-1;
            badpairs+=i-goodpairs;

        }
        return badpairs;
    }
}