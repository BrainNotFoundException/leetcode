class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        int freqArr[] = new int[n];
        int retArr[] = new int[n];
        int noOfCommons = 0;

        for(int i=0; i<n; i++){
            freqArr[A[i]-1] += 1;
            freqArr[B[i]-1] += 1;
            if(A[i] != B[i]){
                if(freqArr[A[i]-1]==2){
                    noOfCommons+=1;
                }
                if(freqArr[B[i]-1]==2){
                    noOfCommons+=1;
                }
            }else{
                noOfCommons+=1;
            }
            
            retArr[i] = noOfCommons;
        }
                
        return retArr;

    }
}