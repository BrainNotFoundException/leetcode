import java.util.HashSet;

class FindMissingAndRepeatedValuesHashSet{
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int n2 = n*n;
        int a[] = new int[2];
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=1; i<=n2; i++){
            set.add(i);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!set.contains(grid[i][j])){
                    a[0] = grid[i][j];
                }
                set.remove(grid[i][j]);
            }
        }

        for(int i : set){
            a[1] = i;
        }

        return a;

    }
}