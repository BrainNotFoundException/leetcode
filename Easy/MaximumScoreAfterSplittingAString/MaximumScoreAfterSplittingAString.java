class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        int z=0;
        int o=0;
        for (int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='0'){
                z++;
            }else{
                o++;
            }

            maxScore=maxScore>(z-o)?maxScore:(z-o);

        }

        if (s.charAt(s.length()-1)=='1'){
            o++;
        }

        return (o+maxScore);
    }
}