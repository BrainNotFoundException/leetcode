class MinimumRecolorsToGetKConsecutiveBlackBlocksOptimized {
    public int minimumRecolors(String blocks, int k) {
        
        int min = Integer.MAX_VALUE;
        int n = blocks.length();
        int c=0;

        for(int i=0; i<n; i++){

            if(blocks.charAt(i)=='W'){
                c++;
            }
            if(i>=k-1){
                if(c<min){
                    min=c;
                }
                if(blocks.charAt(i-k+1)=='W'){
                    c--;
                }
            }

        }

        return min;

    }
}