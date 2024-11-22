class CountUnguardedCellsInTheGrid {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int walled = 1;
        int g = 2;
        int guarded = 3;

        int[][] cells = new int[m][n];

        for (int[] wall : walls){
            cells[wall[0]][wall[1]] = walled;
        }

        for (int[] guard : guards){
            cells[guard[0]][guard[1]] = g;
        }

        for (int[] guard : guards){

            int x = guard[0];
            int y = guard[1];
            for (int i = guard[0]-1; i>-1; i--){
                if (cells[i][y] == walled || cells[i][y] == g ){
                    break;
                }
                cells[i][y] = guarded;
            }

            for (int i = guard[0]+1; i<m; i++){
                if (cells[i][y] == walled || cells[i][y] == g ){
                    break;
                }
                cells[i][y] = guarded;
            }

            for (int i = guard[1]+1; i<n; i++){
                if (cells[x][i] == walled || cells[x][i] == g ){
                    break;
                }
                cells[x][i] = guarded;
            }

            for (int i = guard[1]-1; i>-1; i--){
                if (cells[x][i] == walled || cells[x][i] == g ){
                    break;
                }
                cells[x][i] = guarded;
            }

        }

        int count = 0;
        for (int[] row : cells){
            for (int cell : row){
                if (cell == 0){
                    count+=1;
                }
            }
        }
        return count;
        
    }
}