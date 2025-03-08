class MinimumRecolorsToGetKConsecutiveBlackBlocksUnoptimized {
    public int minimumRecolors(String blocks, int k) {
        
        int min = Integer.MAX_VALUE;
        int n1 = blocks.length()-k+1;

        for(int i=0; i<n1; i++){
            int c=0;
            for(int j=i; j<i+k; j++){
                if(blocks.charAt(j)=='W'){
                    c++;
                }
            }

            if(c<min){
                min=c;
            }
        }

        return min;

    }
}