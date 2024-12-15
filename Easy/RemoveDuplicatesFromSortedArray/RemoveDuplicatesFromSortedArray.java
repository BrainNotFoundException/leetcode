class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] so = new int[nums.length];

        if (nums.length == 0){
            return 0;
        }

        int prev = nums[0];
        so[0] = prev;
        int c = 1;
        for (int i=1; i<nums.length; i++){
            if (!(nums[i]==prev))   {
                prev = nums[i];
                so[c] = prev;
                c+=1;
            }
        }

        System.arraycopy(so, 0, nums, 0, so.length);
        return c;
    }
}