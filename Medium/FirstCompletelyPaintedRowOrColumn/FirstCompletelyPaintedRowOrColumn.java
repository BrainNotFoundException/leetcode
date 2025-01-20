import java.util.HashMap;

class FirstCompletelyPaintedRowOrColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> positions = new HashMap<>();

        int rows = mat.length;
        int cols = mat[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                positions.put(mat[i][j], new int[] {i, j});
            }
        }

        int[] r = new int[rows];
        for(int i=0;i<rows; i++){
            r[i] = cols;
        }
        int[] c = new int[cols];
        for(int i=0; i<cols; i++){
            c[i] = rows;
        }

        for(int i=0; i<arr.length; i++){
            int[] pos = positions.get(arr[i]);
            r[pos[0]] -= 1;
            c[pos[1]] -= 1;
            if(r[pos[0]] == 0 || c[pos[1]] == 0){
                return i;
            }
        }
        return -1;
    }
}