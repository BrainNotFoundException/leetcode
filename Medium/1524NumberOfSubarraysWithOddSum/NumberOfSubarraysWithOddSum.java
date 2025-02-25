class NumberOfSubarraysWithOddSum {
    public int numOfSubarrays(int[] arr) {
        
        long num=0;
        int sum=0, eve=1, odd=0;

        for(int i=0; i<arr.length; i++){

            sum+=arr[i];
            if(sum%2==0){
                num+=odd;
                eve++;
            }else{
                num+=eve;
                odd++;
            }

        }

        return (int)(num%(Math.pow(10, 9)+7));

    }
}