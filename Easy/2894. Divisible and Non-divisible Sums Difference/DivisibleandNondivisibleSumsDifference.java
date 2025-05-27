class DivisibleandNondivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        
        int x = (int)(n/m);

        return (int)(n*(n+1)/2) - m*(x*(x+1));

    }
}