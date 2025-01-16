class BitwiseXORofAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1%2==0 && n2%2==0){

            return 0;

        }else if(n1%2==0){

            int xor = 0;
            for(int i=0; i<n1; i++){
                xor = xor^nums1[i];
            }
            return xor;

        }else if(n2%2==0){

            int xor = 0;
            for(int i=0; i<n2; i++){
                xor = xor^nums2[i];
            }
            return xor;

        }else{

            int xor=0;
            for(int i=0; i<n1; i++){
                xor = xor^nums1[i];
            }
            for(int i=0; i<n2; i++){
                xor = xor^nums2[i];
            }
            return xor;
            
        }
    }
}