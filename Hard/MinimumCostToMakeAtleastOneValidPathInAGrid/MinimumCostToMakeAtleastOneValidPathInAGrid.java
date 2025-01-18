import java.util.ArrayDeque;
import java.util.Deque;

class MinimumCostToMakeAtleastOneValidPathInAGrid{
    public int minCost(int[][] grid) {

        int moves[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int m = grid.length;
        int n = grid[0].length;
        int costGrid[][] = new int[m][n];
        for(int[] row : costGrid){
            for(int i=0; i<n; i++){
                row[i] = Integer.MAX_VALUE;
            }
        }
        costGrid[0][0]=0;

        Deque<int[]> queue = new ArrayDeque<>();
        queue.addFirst(new int[] {0, 0});

        while(!queue.isEmpty()){
            int[] pos = queue.pollFirst();
            int i=pos[0];
            int j=pos[1];

            for(int k=0; k<4; k++){
                int row = i + moves[k][0];
                int col = j + moves[k][1];
                int cost = grid[i][j] == k+1 ? 0 : 1;
                
                if(row>=0 && col>=0 && row<m && col<n && costGrid[i][j] + cost < costGrid[row][col]){
                    costGrid[row][col] = costGrid[i][j] + cost;
                    if(cost==1){
                        queue.add(new int[] {row, col});
                    }else{
                        queue.addFirst(new int[] {row, col});
                    }
                }
            }
        }

        return costGrid[m-1][n-1];
        
    }
}