import java.util.HashMap;

class FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {

        int out[] = new int[queries.length];

        HashMap<Integer, Integer> ballColor = new HashMap<>();
        HashMap<Integer, Integer> colorCount = new HashMap<>();

        for(int i=0; i<queries.length; i++){
            
            int ball = queries[i][0];
            int color = queries[i][1];

            if(ballColor.containsKey(ball)){
                
                int colorOfBall = ballColor.get(ball);
                colorCount.put(colorOfBall, colorCount.get(colorOfBall)-1);
                if(colorCount.get(colorOfBall)==0){
                    colorCount.remove(colorOfBall);
                }

            }

            ballColor.put(ball, color);
            if(colorCount.containsKey(color)){
                colorCount.put(color, colorCount.get(color)+1);
            }else{
                colorCount.put(color, 1);
            }

            out[i] = colorCount.size();

        }

        return out;

    }
}